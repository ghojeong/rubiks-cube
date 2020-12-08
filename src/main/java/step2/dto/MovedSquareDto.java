package step2.dto;

import step2.domain.SquareMove;

public class MovedSquareDto {
    private final SquareMove move;
    private final SquareDto squareDto;

    public MovedSquareDto(SquareMove move, SquareDto squareDto) {
        this.move = move;
        this.squareDto = squareDto;
    }

    public SquareMove getMove() {
        return move;
    }

    public SquareDto getSquareDto() {
        return squareDto;
    }
}
