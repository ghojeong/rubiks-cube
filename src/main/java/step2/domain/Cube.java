package step2.domain;

import step2.dto.CubeDto;

import java.util.Arrays;

public class Cube {
    private final char[][] cube;

    public Cube() {
        cube = new char[3][3];
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

    private Cube(char[][] cube) {
        this.cube = cube;
    }

    @Override
    protected Cube clone() {
        char[][] clonedCube = new char[3][3];
        for (int i = 0; i < cube.length; i++) {
            clonedCube[i] = Arrays.copyOf(cube[i], cube[i].length);
        }
        return new Cube(clonedCube);
    }

    void move(Move move) {
        int position = move.getPosition();
        int i = position;
        int j = position;

        Direction direction = move.getDirection();
        int iDir = direction.getI();
        int jDir = direction.getJ();

        int movedI = getMovedPosition(i, iDir);
        int movedJ = getMovedPosition(j, jDir);

        char oldTemp = cube[movedI][movedJ];
        cube[movedI][movedJ] = cube[i][j];

        i = movedI;
        j = movedJ;
        movedI = getMovedPosition(i, iDir);
        movedJ = getMovedPosition(j, jDir);

        char newTemp = cube[movedI][movedJ];
        cube[movedI][movedJ] = oldTemp;
        oldTemp = newTemp;

        i = movedI;
        j = movedJ;
        movedI = getMovedPosition(i, iDir);
        movedJ = getMovedPosition(j, jDir);

        cube[movedI][movedJ] = oldTemp;
    }

    private int getMovedPosition(int position, int direction) {
        return (position + direction + 3) % 3;
    }

    public CubeDto exportCubeDto() {
        return new CubeDto(cube);
    }
}
