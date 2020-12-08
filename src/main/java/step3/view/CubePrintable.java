package step3.view;


import step3.dto.CubeDto;

class CubePrintable extends Printable {
    CubePrintable(CubeDto resultDto) {
        char[][][] cube = resultDto.getCube();
        appendTopBottomSquare(cube[0]);
        append(lineSeparator);
        appendCube(cube);
        append(lineSeparator);
        appendTopBottomSquare(cube[5]);
    }

    private void appendTopBottomSquare(char[][] square) {
        append("                ");
        appendRow(0, square);
        append(lineSeparator);
        append("                ");
        appendRow(1, square);
        append(lineSeparator);
        append("                ");
        appendRow(2, square);
        append(lineSeparator);
    }

    private void appendCube(char[][][] cube) {
        appendRow(0, cube[1]);
        appendRow(0, cube[2]);
        appendRow(0, cube[3]);
        appendRow(0, cube[4]);
        append(lineSeparator);
        appendRow(1, cube[1]);
        appendRow(1, cube[2]);
        appendRow(1, cube[3]);
        appendRow(1, cube[4]);
        append(lineSeparator);
        appendRow(2, cube[1]);
        appendRow(2, cube[2]);
        appendRow(2, cube[3]);
        appendRow(2, cube[4]);
        append(lineSeparator);
    }

    private void appendRow(int i, char[][] square) {
        append(square[i][0]);
        append(" ");
        append(square[i][1]);
        append(" ");
        append(square[i][2]);
        append("     ");
    }
}
