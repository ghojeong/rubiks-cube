package step2.controller;

import step2.domain.SquareMove;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

class InputParser {
    private final List<SquareMove> squareMoves;

    private InputParser(List<SquareMove> squareMoves) {
        this.squareMoves = squareMoves;
    }

    static InputParser of(String input) {
        input = replace(input);
        List<SquareMove> squareMoves = Arrays.asList(input.split(""))
                .stream()
                .map(SquareMove::valueOf)
                .collect(toList());
        return new InputParser(squareMoves);
    }

    private static String replace(String input) {
        input = input.replace("U'", "u");
        input = input.replace("R'", "r");
        input = input.replace("L'", "l");
        input = input.replace("B'", "b");
        return input;
    }

    List<SquareMove> getMoves() {
        return squareMoves;
    }
}
