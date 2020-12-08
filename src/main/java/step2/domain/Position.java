package step2.domain;

class Position {
    private final int i;
    private final int j;

    Position(int i, int j) {
        this.i = i;
        this.j = j;
    }

    char getElement(char[][] square) {
        return square[i][j];
    }

    void setElement(char[][] square, char element) {
        square[i][j] = element;
    }

    Position getMovedPosition(SquareMove squareMove) {
        Direction direction = squareMove.getDirection();
        int iDir = direction.getI();
        int jDir = direction.getJ();
        return new Position(getMoved(i, iDir), getMoved(j, jDir));

    }

    private int getMoved(int index, int direction) {
        return (index + direction + 3) % 3;
    }
}
