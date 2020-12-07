package step.view;

import step.dto.ResultDto;

public class View {
    private View() {}

    public static void printResult(ResultDto resultDto) {
        new ResultPrintable(resultDto).print();
    }
}
