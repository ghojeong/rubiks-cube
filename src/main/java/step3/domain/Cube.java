package step3.domain;

import step3.dto.CubeDto;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static java.util.stream.Collectors.toCollection;

public class Cube {
    private static final char[][][] correctCube = new char[6][3][3];

    static {
        setSquare(correctCube[0], 'B'); // top
        setSquare(correctCube[1], 'W'); // front
        setSquare(correctCube[2], 'O'); // right
        setSquare(correctCube[3], 'G'); // back
        setSquare(correctCube[4], 'Y'); // left
        setSquare(correctCube[5], 'R'); // bottom
    }

    private final char[][][] cube;

    private Cube(char[][][] cube) {
        this.cube = cube;
    }

    public Cube() {
        cube = new char[6][3][3];
        setSquare(cube[0], 'B'); // top
        setSquare(cube[1], 'W'); // front
        setSquare(cube[2], 'O'); // right
        setSquare(cube[3], 'G'); // back
        setSquare(cube[4], 'Y'); // left
        setSquare(cube[5], 'R'); // bottom
    }

    public static Cube of(List<CubeMove> cubeMoves) {
        Cube cube = new Cube();
        cubeMoves.forEach(cube::move);
        return cube;
    }

    private static void setSquare(char[][] square, char color) {
        for (int i = 0; i < square.length; i++) {
            Arrays.fill(square[i], color);
        }
    }

    private static void copySquare(char[][] src, char[][] dest) {
        for (int i = 0; i < dest.length; i++) {
            copyRow(src[i], dest[i]);
        }
    }

    private static void copyRow(char[] src, char[] dest) {
        for (int i = 0; i < dest.length; i++) {
            dest[i] = src[i];
        }
    }

    void move(CubeMove cubeMove) {
        List<Position> positions = cubeMove.getPositions();
        LinkedList<Character> colors = positions
                .stream()
                .map(position -> position.getElement(cube))
                .collect(toCollection(LinkedList::new));

        colors.addFirst(colors.removeLast());
        colors.addFirst(colors.removeLast());
        colors.addFirst(colors.removeLast());

        setElements(positions, colors);
    }

    private void setElements(List<Position> positions, List<Character> colors) {
        Iterator<Position> posItr = positions.iterator();
        Iterator<Character> colorItr = colors.iterator();
        while (posItr.hasNext()) {
            posItr.next().setElement(cube, colorItr.next());
        }
    }

    @Override
    protected Cube clone() {
        char[][][] clonedCube = new char[6][3][3];
        for (int i = 0; i < cube.length; i++) {
            copySquare(cube[i], clonedCube[i]);
        }
        return new Cube(clonedCube);
    }


    public CubeDto exportCubeDto() {
        return new CubeDto(cube.clone());
    }

    public boolean isCorrect() {
        return Arrays.deepEquals(cube, correctCube);
    }
}
