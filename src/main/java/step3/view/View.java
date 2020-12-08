package step3.view;

import step3.dto.ByeDto;
import step3.dto.CubeDto;
import step3.dto.InputDto;
import step3.dto.MovedCubesDto;

import java.util.Scanner;

public class View {
    private static final Scanner scanner = new Scanner(System.in);

    private View() {}

    public static InputDto askInput() {
        print(AskInputPrintable.getInstance());
        return new InputDto(scanner.nextLine());
    }

    public static void printCube(CubeDto cubeDto) {
        print(new CubePrintable(cubeDto));
    }

    public static void printMovedCubes(MovedCubesDto movedCubesDto) {
        print(new MovedSquaresPrintable(movedCubesDto));
    }

    public static void printBye(ByeDto byeDto) {
        print(new ByePrintable(byeDto));
    }

    private static void print(Object obj) {
        System.out.print(obj);
    }
}
