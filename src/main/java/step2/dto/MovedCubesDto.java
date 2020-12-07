package step2.dto;

import java.util.List;

public class MovedCubesDto {
    private final List<MovedCubeDto> movedCubes;

    public MovedCubesDto(List<MovedCubeDto> movedCubes) {
        this.movedCubes = movedCubes;
    }

    public List<MovedCubeDto> getMovedCubes() {
        return movedCubes;
    }
}
