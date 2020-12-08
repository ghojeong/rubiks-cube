package step3.dto;

import java.util.List;

public class MovedCubesDto {
    private final List<MovedCubeDto> movedSquares;

    public MovedCubesDto(List<MovedCubeDto> movedSquares) {
        this.movedSquares = movedSquares;
    }

    public List<MovedCubeDto> getMovedSquares() {
        return movedSquares;
    }
}
