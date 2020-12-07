package step2.domain;

import step2.dto.MovedSquareDto;

class MovedSquare {
    private final Move move;
    private final Square square;

    MovedSquare(Move move, Square square) {
        this.move = move;
        this.square = square;
    }

    MovedSquareDto exportMovedSquareDto() {
        return new MovedSquareDto(move.name(), square.exportSquareDto());
    }
}
