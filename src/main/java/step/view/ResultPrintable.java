package step.view;

import step.dto.ResultDto;

class ResultPrintable extends Printable {
    ResultPrintable(ResultDto resultDto) {
        append(lineSeparator);
        append(resultDto.getResult());
    }
}
