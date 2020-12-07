package step2.controller;

import step2.domain.Cube;
import step2.view.View;

public class Main {
    private Main() {}

    public static void main(String[] args) {
        Cube cube = new Cube();
        View.printCube(cube.exportCubeDto());
        String input = View.askInput().getInput();
        View.printBye();
    }
}
