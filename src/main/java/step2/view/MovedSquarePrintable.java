package step2.view;

import step2.domain.SquareMove;
import step2.dto.MovedSquareDto;

import static step2.domain.SquareMove.*;

class MovedSquarePrintable extends Printable {
    MovedSquarePrintable(MovedSquareDto movedSquareDto) {
        append(lineSeparator);
        append(toString(movedSquareDto.getMove()));
        append(lineSeparator);
        append(new SquarePrintable(movedSquareDto.getSquareDto()));
    }

    private String toString(SquareMove squareMove) {
        return squareMove == U
                ? "U"
                : squareMove == u
                ? "U'"
                : squareMove == R
                ? "R"
                : squareMove == r
                ? "R'"
                : squareMove == L
                ? "L"
                : squareMove == l
                ? "L'"
                : squareMove == B
                ? "B"
                : squareMove == b
                ? "B'"
                : "";
    }
}
