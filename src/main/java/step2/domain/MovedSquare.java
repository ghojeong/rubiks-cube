package step2.domain;

import step2.dto.MovedSquareDto;

class MovedSquare {
    private final SquareMove squareMove;
    private final Square square;

    MovedSquare(SquareMove squareMove, Square square) {
        this.squareMove = squareMove;
        this.square = square;
    }

    MovedSquareDto exportMovedSquareDto() {
        return new MovedSquareDto(squareMove, square.exportSquareDto());
    }
}
