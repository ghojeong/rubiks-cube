package step2.view;

import step2.dto.MovedCubesDto;

public class MovedCubesPrintable extends Printable {
    MovedCubesPrintable(MovedCubesDto movedCubesDto) {
        movedCubesDto.getMovedCubes()
                .stream()
                .map(MovedCubePrintable::new)
                .forEach(this::append);
    }
}
