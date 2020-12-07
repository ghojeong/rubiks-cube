package step2.domain;

public enum Move {
    U(0, Direction.LEFT),
    u(0, Direction.RIGHT),
    R(2, Direction.UP),
    r(2, Direction.DOWN),
    L(0, Direction.DOWN),
    l(0, Direction.UP),
    B(2, Direction.RIGHT),
    b(2, Direction.LEFT);

    private final Integer position;
    private final Direction direction;

    Move(Integer position, Direction direction) {
        this.position = position;
        this.direction = direction;
    }

    public Integer getPosition() {
        return position;
    }

    public Direction getDirection() {
        return direction;
    }
}
