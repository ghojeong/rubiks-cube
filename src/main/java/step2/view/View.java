package step2.view;

import step2.dto.InputDto;
import step2.dto.MovedSquaresDto;
import step2.dto.SquareDto;

import java.util.Scanner;

public class View {
    private static final Scanner scanner = new Scanner(System.in);

    private View() {}

    public static InputDto askInput() {
        print(AskInputPrintable.getInstance());
        return new InputDto(scanner.nextLine());
    }

    public static void printSquare(SquareDto squareDto) {
        print(new SquarePrintable(squareDto));
    }

    public static void printMovedSquares(MovedSquaresDto movedSquaresDto) {
        print(new MovedSquaresPrintable(movedSquaresDto));
    }

    public static void printBye() {
        print(ByePrintable.getInstance());
    }

    private static void print(Object obj) {
        System.out.print(obj);
    }
}
