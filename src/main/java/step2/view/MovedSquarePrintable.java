package step2.view;

import step2.dto.MovedSquareDto;

class MovedSquarePrintable extends Printable {
    MovedSquarePrintable(MovedSquareDto movedSquareDto) {
        append(lineSeparator);
        append(movedSquareDto.getMove());
        append(lineSeparator);
        append(new SquarePrintable(movedSquareDto.getSquareDto()));
    }
}
