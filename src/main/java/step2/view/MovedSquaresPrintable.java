package step2.view;

import step2.dto.MovedSquaresDto;

class MovedSquaresPrintable extends Printable {
    MovedSquaresPrintable(MovedSquaresDto movedSquaresDto) {
        movedSquaresDto.getMovedSquares()
                .stream()
                .map(MovedSquarePrintable::new)
                .forEach(this::append);
    }
}
