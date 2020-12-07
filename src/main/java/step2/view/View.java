package step2.view;

import step2.dto.CubeDto;
import step2.dto.InputDto;
import step2.dto.MovedCubesDto;

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
        print(new MovedCubesPrintable(movedCubesDto));
    }

    public static void printBye() {
        print(ByePrintable.getInstance());
    }

    private static void print(Object obj) {
        System.out.print(obj);
    }
}
