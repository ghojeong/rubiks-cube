package step1.domain;

public enum Direction {
    R(-1),
    L(1);

    private final int cartesian;

    Direction(int cartesian) {
        this.cartesian = cartesian;
    }

    public int getCartesian() {
        return cartesian;
    }
}
