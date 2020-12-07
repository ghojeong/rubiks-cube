package step2.domain;

import step2.dto.MovedCubesDto;

import java.util.LinkedList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class MovedCubes {
    private final List<MovedCube> movedCubes;

    private MovedCubes(List<MovedCube> movedCubes) {
        this.movedCubes = movedCubes;
    }

    public static MovedCubes of(List<Move> moves) {
        List<MovedCube> movedCubes = new LinkedList<>();
        Cube cube = new Cube();
        moves.forEach(move -> {
            cube.move(move);
            movedCubes.add(new MovedCube(move, cube.clone()));
        });
        return new MovedCubes(movedCubes);
    }

    public MovedCubesDto exportMovedCubesDto() {
        return new MovedCubesDto(movedCubes.stream()
                .map(MovedCube::exportMovedCubeDto)
                .collect(toList()));
    }
}
