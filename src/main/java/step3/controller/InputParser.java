package step3.controller;

import step3.domain.CubeMove;

import java.util.LinkedList;
import java.util.List;

class InputParser {
    private final List<CubeMove> cubeMoves;

    private InputParser() {
        cubeMoves = new LinkedList<>();
    }

    static InputParser of(String input) {
        InputParser inputParser = new InputParser();
        input = replace(input);
        String[] moves = input.split("");
        for (int i = 0; i < moves.length; i++) {
            inputParser.add(moves, i);
        }
        return inputParser;
    }

    private static String replace(String input) {
        input = input.replace("F'", "f");
        input = input.replace("B'", "b");
        input = input.replace("L'", "l");
        input = input.replace("R'", "r");
        input = input.replace("U'", "u");
        input = input.replace("D'", "d");
        return input;
    }

    private void add(String[] moves, int index) {
        try {
            add(CubeMove.valueOf(moves[index]));
        } catch (IllegalArgumentException e) {
            add(
                    CubeMove.valueOf(moves[index - 1]),
                    Integer.parseInt(moves[index]) - 1);
        }
    }

    private void add(CubeMove cubeMove, int repeat) {
        for (int i = 0; i < repeat; i++) {
            add(cubeMove);
        }
    }

    private void add(CubeMove cubeMove) {
        cubeMoves.add(cubeMove);
    }

    List<CubeMove> getMoves() {
        return cubeMoves;
    }
}
