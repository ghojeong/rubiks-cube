package step2.dto;

public class MovedSquareDto {
    private final String move;
    private final SquareDto squareDto;

    public MovedSquareDto(String move, SquareDto squareDto) {
        this.move = move;
        this.squareDto = squareDto;
    }

    public String getMove() {
        return move;
    }

    public SquareDto getSquareDto() {
        return squareDto;
    }
}
