package step2.view;


import step2.dto.CubeDto;

class CubePrintable extends Printable {
    CubePrintable(CubeDto resultDto) {
        appendCube(resultDto.getCube());
    }

    private void appendCube(char[][] cube) {
        appendRow(0, cube);
        append(lineSeparator);
        appendRow(1, cube);
        append(lineSeparator);
        appendRow(2, cube);
        append(lineSeparator);
    }

    private void appendRow(int i, char[][] cube) {
        append(cube[i][0]);
        append(" ");
        append(cube[i][1]);
        append(" ");
        append(cube[i][2]);
    }
}
