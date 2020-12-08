package step3.domain;

class Position {
    private final int square;
    private final int i;
    private final int j;

    Position(int square, int i, int j) {
        this.square = square;
        this.i = i;
        this.j = j;
    }

    char getElement(char[][][] cube) {
        return cube[square][i][j];
    }

    void setElement(char[][][] cube, char color) {
        cube[square][i][j] = color;
    }
}
