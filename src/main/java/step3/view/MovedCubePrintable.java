package step3.view;

import step3.domain.CubeMove;
import step3.dto.MovedCubeDto;

import static step3.domain.CubeMove.*;

class MovedCubePrintable extends Printable {
    MovedCubePrintable(MovedCubeDto movedCubeDto) {
        append(lineSeparator);
        append(toString(movedCubeDto.getMove()));
        append(lineSeparator);
        append(new CubePrintable(movedCubeDto.getCubeDto()));
    }

    private String toString(CubeMove squareMove) {
        return squareMove == F
                ? "F"
                : squareMove == f
                ? "F'"
                : squareMove == B
                ? "B"
                : squareMove == b
                ? "B'"
                : squareMove == L
                ? "L"
                : squareMove == l
                ? "L'"
                : squareMove == R
                ? "R"
                : squareMove == r
                ? "R'"
                : squareMove == U
                ? "U"
                : squareMove == u
                ? "U'"
                : squareMove == D
                ? "D"
                : squareMove == d
                ? "D'"
                : "";
    }
}
