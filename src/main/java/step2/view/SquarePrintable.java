package step2.view;


import step2.dto.SquareDto;

class SquarePrintable extends Printable {
    SquarePrintable(SquareDto resultDto) {
        appendSquare(resultDto.getSquare());
    }

    private void appendSquare(char[][] square) {
        appendRow(0, square);
        append(lineSeparator);
        appendRow(1, square);
        append(lineSeparator);
        appendRow(2, square);
        append(lineSeparator);
    }

    private void appendRow(int i, char[][] square) {
        append(square[i][0]);
        append(" ");
        append(square[i][1]);
        append(" ");
        append(square[i][2]);
    }
}
