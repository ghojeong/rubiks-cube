package step3.domain;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static java.util.Collections.reverse;

public enum CubeMove {
    F(Arrays.asList(
            new Position(0, 2, 0),
            new Position(0, 2, 1),
            new Position(0, 2, 2),

            new Position(2, 0, 0),
            new Position(2, 1, 0),
            new Position(2, 2, 0),

            new Position(5, 2, 0),
            new Position(5, 2, 1),
            new Position(5, 2, 2),

            new Position(4, 2, 2),
            new Position(4, 1, 2),
            new Position(4, 0, 2)
    )),
    f(F.getReversed()),

    B(Arrays.asList(
            new Position(0, 0, 2),
            new Position(0, 0, 1),
            new Position(0, 0, 0),

            new Position(4, 0, 0),
            new Position(4, 1, 0),
            new Position(4, 2, 0),

            new Position(5, 0, 2),
            new Position(5, 0, 1),
            new Position(5, 0, 0),

            new Position(2, 2, 2),
            new Position(2, 1, 2),
            new Position(2, 0, 2)
    )),
    b(B.getReversed()),

    L(Arrays.asList(
            new Position(0, 0, 0),
            new Position(0, 1, 0),
            new Position(0, 2, 0),

            new Position(1, 0, 0),
            new Position(1, 1, 0),
            new Position(1, 2, 0),

            new Position(5, 2, 2),
            new Position(5, 1, 2),
            new Position(5, 0, 2),

            new Position(3, 2, 2),
            new Position(3, 1, 2),
            new Position(3, 0, 2)
    )),
    l(L.getReversed()),


    R(Arrays.asList(
            new Position(0, 2, 2),
            new Position(0, 1, 2),
            new Position(0, 0, 2),

            new Position(3, 0, 0),
            new Position(3, 1, 0),
            new Position(3, 2, 0),

            new Position(5, 0, 0),
            new Position(5, 1, 0),
            new Position(5, 2, 0),

            new Position(1, 2, 2),
            new Position(1, 1, 2),
            new Position(1, 0, 2)
    )),
    r(R.getReversed()),


    U(Arrays.asList(
            new Position(4, 0, 2),
            new Position(4, 0, 1),
            new Position(4, 0, 0),

            new Position(3, 0, 2),
            new Position(3, 0, 1),
            new Position(3, 0, 0),

            new Position(2, 0, 2),
            new Position(2, 0, 1),
            new Position(2, 0, 0),

            new Position(1, 0, 2),
            new Position(1, 0, 1),
            new Position(1, 0, 0)
    )),
    u(U.getReversed()),

    D(Arrays.asList(
            new Position(4, 2, 2),
            new Position(4, 2, 1),
            new Position(4, 2, 0),

            new Position(3, 2, 2),
            new Position(3, 2, 1),
            new Position(3, 2, 0),

            new Position(2, 2, 2),
            new Position(2, 2, 1),
            new Position(2, 2, 0),

            new Position(1, 2, 2),
            new Position(1, 2, 1),
            new Position(1, 2, 0)
    )),
    d(D.getReversed());


    private final List<Position> positions;

    CubeMove(List<Position> positions) {
        this.positions = positions;
    }

    public List<Position> getPositions() {
        return new LinkedList<>(positions);
    }

    private List<Position> getReversed() {
        List<Position> positions = new LinkedList<>(this.positions);
        reverse(positions);
        return positions;
    }
}
