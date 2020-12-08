package step3.controller;

import step3.domain.Cube;
import step3.domain.CubeMove;
import step3.domain.MovedCubes;
import step3.dto.ByeDto;
import step3.view.View;

import java.util.List;

public class Main {
    private Main() {}

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        // Cube cube = new Cube();
        Cube cube = Cube.of(new Shuffler().getCubeMoves());

        View.printCube(cube.exportCubeDto());
        String input = View.askInput().getInput();
        int operateNumber = 0;
        while (!input.equals("Q")) {
            List<CubeMove> moves = InputParser.of(input).getMoves();
            operateNumber += moves.size();
            MovedCubes movedSquares = MovedCubes.of(cube, moves);
            View.printMovedCubes(movedSquares.exportMovedSquaresDto());
            if (operateNumber > 0 && cube.isCorrect()) {
                break;
            }
            input = View.askInput().getInput();
        }

        String byeMessage = cube.isCorrect()
                ? "큐브의 모든 면을 맞추셨습니다. 축하합니다!"
                : "이용해주셔서 감사합니다. 뚜뚜뚜.";
        View.printBye(new ByeDto(
                System.currentTimeMillis() - startTime
                , operateNumber
                , byeMessage
        ));
    }
}
