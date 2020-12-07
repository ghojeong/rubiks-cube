package step1.view;

import step1.dto.InputDto;
import step1.dto.WordDto;

import java.util.Scanner;

public class View {
    private static final Scanner scanner = new Scanner(System.in);

    private View() {}

    public static InputDto askInput() {
        return new InputDto(scanner.nextLine());
    }

    public static void printResult(WordDto wordDto) {
        new WordPrintable(wordDto).print();
    }
}
