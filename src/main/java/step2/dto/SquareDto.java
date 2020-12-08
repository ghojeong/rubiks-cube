package step2.dto;

public class SquareDto {
    private final char[][] square;

    public SquareDto(char[][] square) {
        this.square = square;
    }

    public char[][] getSquare() {
        return square;
    }
}
