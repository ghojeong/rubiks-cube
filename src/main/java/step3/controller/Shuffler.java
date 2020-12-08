package step3.controller;

import step3.domain.CubeMove;

import java.util.*;

class Shuffler {
    private static final Random random = new Random();
    private final List<CubeMove> cubeMoves = new LinkedList<>();

    Shuffler() {
        Arrays.asList(CubeMove.values())
                .forEach(this::addRandomTimes);
        Collections.shuffle(cubeMoves);
    }

    private void addRandomTimes(CubeMove move) {
        for (int i = 0; i < random.nextInt(10); i++) {
            cubeMoves.add(move);
        }
    }

    List<CubeMove> getCubeMoves() {
        return cubeMoves;
    }
}
