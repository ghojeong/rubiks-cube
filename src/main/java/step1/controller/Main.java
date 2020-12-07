package step1.controller;

import step1.domain.Word;
import step1.view.View;

public class Main {
    private Main() {}

    public static void main(String[] args) {
        InputParser parser = InputParser.of(View.askInput());
        Word word = new Word(parser.getWord());
        word.move(parser.getPosition(), parser.getDirection());
        View.printResult(word.exportWordDto());
    }
}
