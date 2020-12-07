package step2.domain;

enum Direction {
    UP(-1, 0),
    RIGHT(0, 1),
    LEFT(0, -1),
    DOWN(1, 0);

    private final int iDirection;
    private final int jDirection;

    Direction(int iDirection, int jDirection) {
        this.iDirection = iDirection;
        this.jDirection = jDirection;
    }

    public int getI() {
        return iDirection;
    }

    public int getJ() {
        return jDirection;
    }
}
