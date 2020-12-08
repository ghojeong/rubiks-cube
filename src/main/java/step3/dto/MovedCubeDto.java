package step3.dto;

import step3.domain.CubeMove;

public class MovedCubeDto {
    private final CubeMove move;
    private final CubeDto cubeDto;

    public MovedCubeDto(CubeMove move, CubeDto cubeDto) {
        this.move = move;
        this.cubeDto = cubeDto;
    }

    public CubeMove getMove() {
        return move;
    }

    public CubeDto getCubeDto() {
        return cubeDto;
    }
}
