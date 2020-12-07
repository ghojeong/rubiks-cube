package step2.view;

import step2.dto.MovedCubeDto;

class MovedCubePrintable extends Printable {
    MovedCubePrintable(MovedCubeDto movedCubeDto) {
        append(lineSeparator);
        append(movedCubeDto.getMove());
        append(lineSeparator);
        append(new CubePrintable(movedCubeDto.getCubeDto()));
    }
}
