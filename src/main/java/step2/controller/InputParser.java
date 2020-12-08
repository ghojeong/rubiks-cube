package step2.controller;

import step2.domain.Move;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;

class InputParser {
    private final List<Move> moves;

    private InputParser(List<Move> moves) {
        this.moves = moves;
    }

    static InputParser of(String input) {
        input = replace(input);
        List<Move> moves = Arrays.asList(input.split(""))
                .stream()
                .map(Move::valueOf)
                .collect(toList());
        return new InputParser(moves);
    }

    private static String replace(String input) {
        input = input.replace("U'", "u");
        input = input.replace("R'", "r");
        input = input.replace("L'", "l");
        input = input.replace("B'", "b");
        return input;
    }

    List<Move> getMoves() {
        return moves;
    }
}
