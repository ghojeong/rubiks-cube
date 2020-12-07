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

    public static MovedSquares of(List<Move> moves) {
        List<MovedSquare> movedSquares = new LinkedList<>();
        Square square = new Square();
        moves.forEach(move -> {
            square.move(move);
            movedSquares.add(new MovedSquare(move, square.clone()));
        });
        return new MovedSquares(movedSquares);
    }

    public MovedSquaresDto exportMovedSquaresDto() {
        return new MovedSquaresDto(movedSquares.stream()
                .map(MovedSquare::exportMovedSquareDto)
                .collect(toList()));
    }
}
