package step2.domain;

import step2.dto.MovedCubeDto;

class MovedCube {
    private final Move move;
    private final Cube cube;

    MovedCube(Move move, Cube cube) {
        this.move = move;
        this.cube = cube;
    }

    MovedCubeDto exportMovedCubeDto() {
        return new MovedCubeDto(move.name(), cube.exportCubeDto());
    }
}
