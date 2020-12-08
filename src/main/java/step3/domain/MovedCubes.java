package step3.domain;

import step3.dto.MovedCubesDto;

import java.util.LinkedList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class MovedCubes {
    private final List<MovedCube> movedCubes;

    private MovedCubes(List<MovedCube> movedCubes) {
        this.movedCubes = movedCubes;
    }

    public static MovedCubes of(Cube cube, List<CubeMove> cubeMoves) {
        List<MovedCube> movedCubes = new LinkedList<>();
        cubeMoves.forEach(cubeMove -> {
            cube.move(cubeMove);
            movedCubes.add(new MovedCube(cubeMove, cube.clone()));
        });
        return new MovedCubes(movedCubes);
    }

    public MovedCubesDto exportMovedSquaresDto() {
        return new MovedCubesDto(movedCubes.stream()
                .map(MovedCube::exportMovedSquareDto)
                .collect(toList()));
    }
}
