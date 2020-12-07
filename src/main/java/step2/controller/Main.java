package step2.controller;

import step2.domain.Cube;
import step2.domain.MovedCubes;
import step2.view.View;

public class Main {
    private Main() {}

    public static void main(String[] args) {
        Cube cube = new Cube();
        View.printCube(cube.exportCubeDto());
        String input = View.askInput().getInput();
        while (!input.equals("Q")) {
            InputParser parser = InputParser.of(input);
            MovedCubes movedCubes = MovedCubes.of(parser.getMoves());
            View.printMovedCubes(movedCubes.exportMovedCubesDto());
            input = View.askInput().getInput();
        }
        View.printBye();
    }
}
