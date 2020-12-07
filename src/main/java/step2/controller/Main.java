package step2.controller;

import step2.domain.MovedSquares;
import step2.domain.Square;
import step2.view.View;

public class Main {
    private Main() {}

    public static void main(String[] args) {
        Square square = new Square();
        View.printSquare(square.exportSquareDto());
        String input = View.askInput().getInput();
        while (!input.equals("Q")) {
            InputParser parser = InputParser.of(input);
            MovedSquares movedSquares = MovedSquares.of(parser.getMoves());
            View.printMovedSquares(movedSquares.exportMovedSquaresDto());
            input = View.askInput().getInput();
        }
        View.printBye();
    }
}
