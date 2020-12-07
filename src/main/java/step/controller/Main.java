package step.controller;

import step.domain.Result;
import step.view.View;

public class Main {
    private Main() {}

    public static void main(String[] args) {
        Result result = new Result("Hello World!");
        View.printResult(result.exportResultDto());
    }
}
