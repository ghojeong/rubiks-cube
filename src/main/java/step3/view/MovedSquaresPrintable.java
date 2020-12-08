package step3.view;

import step3.dto.MovedCubesDto;

class MovedSquaresPrintable extends Printable {
    MovedSquaresPrintable(MovedCubesDto movedCubesDto) {
        movedCubesDto.getMovedSquares()
                .stream()
                .map(MovedCubePrintable::new)
                .forEach(this::append);
    }
}
