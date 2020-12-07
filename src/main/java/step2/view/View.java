package step2.view;

import step2.dto.CubeDto;
import step2.dto.InputDto;

import java.util.Scanner;

public class View {
    private static final Scanner scanner = new Scanner(System.in);

    private View() {}

    public static InputDto askInput() {
        AskInputPrintable.getInstance().print();
        return new InputDto(scanner.nextLine());
    }

    public static void printCube(CubeDto cubeDto) {
        new CubePrintable(cubeDto).print();
    }

    public static void printBye() {
        ByePrintable.getInstance().print();
    }
}
