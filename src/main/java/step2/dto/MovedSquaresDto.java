package step2.dto;

import java.util.List;

public class MovedSquaresDto {
    private final List<MovedSquareDto> movedSquares;

    public MovedSquaresDto(List<MovedSquareDto> movedSquares) {
        this.movedSquares = movedSquares;
    }

    public List<MovedSquareDto> getMovedSquares() {
        return movedSquares;
    }
}
