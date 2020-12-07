package step2.domain;

import step2.dto.SquareDto;

import java.util.Arrays;

public class Square {
    private final char[][] square;

    public Square() {
        square = new char[3][3];
        square[0][0] = 'R';
        square[0][1] = 'R';
        square[0][2] = 'W';

        square[1][0] = 'G';
        square[1][1] = 'C';
        square[1][2] = 'W';

        square[2][0] = 'G';
        square[2][1] = 'B';
        square[2][2] = 'B';
    }

    private Square(char[][] square) {
        this.square = square;
    }

    @Override
    protected Square clone() {
        char[][] clonedSquare = new char[3][3];
        for (int i = 0; i < square.length; i++) {
            clonedSquare[i] = Arrays.copyOf(square[i], square[i].length);
        }
        return new Square(clonedSquare);
    }

    void move(Move move) {
        int position = move.getPosition();
        int i = position;
        int j = position;

        Direction direction = move.getDirection();
        int iDir = direction.getI();
        int jDir = direction.getJ();

        int movedI = getMovedPosition(i, iDir);
        int movedJ = getMovedPosition(j, jDir);

        char oldTemp = square[movedI][movedJ];
        square[movedI][movedJ] = square[i][j];

        i = movedI;
        j = movedJ;
        movedI = getMovedPosition(i, iDir);
        movedJ = getMovedPosition(j, jDir);

        char newTemp = square[movedI][movedJ];
        square[movedI][movedJ] = oldTemp;
        oldTemp = newTemp;

        i = movedI;
        j = movedJ;
        movedI = getMovedPosition(i, iDir);
        movedJ = getMovedPosition(j, jDir);

        square[movedI][movedJ] = oldTemp;
    }

    private int getMovedPosition(int position, int direction) {
        return (position + direction + 3) % 3;
    }

    public SquareDto exportSquareDto() {
        return new SquareDto(square);
    }
}
