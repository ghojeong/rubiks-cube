package step2.domain;

import step2.dto.CubeDto;

public class Cube {
    private final char[][] cube = new char[3][3];

    public Cube() {
        cube[0][0] = 'R';
        cube[0][1] = 'R';
        cube[0][2] = 'W';

        cube[1][0] = 'G';
        cube[1][1] = 'C';
        cube[1][2] = 'W';

        cube[2][0] = 'G';
        cube[2][1] = 'B';
        cube[2][2] = 'B';
    }

    public CubeDto exportCubeDto() {
        return new CubeDto(cube);
    }
}
