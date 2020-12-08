package step2.domain;

import step2.dto.MovedSquaresDto;

import java.util.LinkedList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class MovedSquares {
    private final List<MovedSquare> movedSquares;

    private MovedSquares(List<MovedSquare> movedSquares) {
        this.movedSquares = movedSquares;
    }

    public static MovedSquares of(Square square, List<SquareMove> squareMoves) {
        List<MovedSquare> movedSquares = new LinkedList<>();
        squareMoves.forEach(squareMove -> {
            square.move(squareMove);
            movedSquares.add(new MovedSquare(squareMove, square.clone()));
        });
        return new MovedSquares(movedSquares);
    }

    public MovedSquaresDto exportMovedSquaresDto() {
        return new MovedSquaresDto(movedSquares.stream()
                .map(MovedSquare::exportMovedSquareDto)
                .collect(toList()));
    }
}
