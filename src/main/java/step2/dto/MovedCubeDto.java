package step2.dto;

public class MovedCubeDto {
    private final String move;
    private final CubeDto cubeDto;

    public MovedCubeDto(String move, CubeDto cubeDto) {
        this.move = move;
        this.cubeDto = cubeDto;
    }

    public String getMove() {
        return move;
    }

    public CubeDto getCubeDto() {
        return cubeDto;
    }
}
