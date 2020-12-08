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

    void move(SquareMove squareMove) {
        int index = squareMove.getIndex();
        Position position = new Position(index, index);
        Position movedPosition = position.getMovedPosition(squareMove);

        char oldTemp = movedPosition.getElement(square);
        movedPosition.setElement(square, position.getElement(square));

        position = movedPosition;
        movedPosition = position.getMovedPosition(squareMove);

        char newTemp = movedPosition.getElement(square);
        movedPosition.setElement(square, oldTemp);
        oldTemp = newTemp;

        position = movedPosition;
        movedPosition = position.getMovedPosition(squareMove);

        movedPosition.setElement(square, oldTemp);
    }

    public SquareDto exportSquareDto() {
        return new SquareDto(square);
    }
}
