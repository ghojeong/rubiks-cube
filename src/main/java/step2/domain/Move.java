package step2.domain;

enum Move {
    U(0, Direction.LEFT),
    U_(0, Direction.RIGHT),
    R(2, Direction.UP),
    R_(2, Direction.DOWN),
    L(0, Direction.DOWN),
    L_(0, Direction.UP),
    B(2, Direction.RIGHT),
    B_(2, Direction.LEFT),
    Q(null, null);

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
