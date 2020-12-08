package step3.domain;

import step3.dto.MovedCubeDto;

class MovedCube {
    private final CubeMove cubeMove;
    private final Cube cube;

    MovedCube(CubeMove cubeMove, Cube cube) {
        this.cubeMove = cubeMove;
        this.cube = cube;
    }

    MovedCubeDto exportMovedSquareDto() {
        return new MovedCubeDto(cubeMove, cube.exportCubeDto());
    }
}
