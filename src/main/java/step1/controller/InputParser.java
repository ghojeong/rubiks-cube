package step1.controller;

import step1.dto.InputDto;

import java.util.StringTokenizer;

public class InputParser {
    private final String word;
    private final int position;
    private final String direction;

    private InputParser(String word, int position, String direction) {
        this.word = word;
        this.position = position;
        this.direction = direction;
    }

    public static InputParser of(InputDto inputDto) {
        StringTokenizer st = new StringTokenizer(inputDto.getInput());
        String word = st.nextToken();
        int position = Integer.parseInt(st.nextToken());
        String direction = st.nextToken();
        return new InputParser(word, position, direction);
    }

    public String getWord() {
        return word;
    }

    public int getPosition() {
        return position;
    }

    public String getDirection() {
        return direction;
    }
}
