package step.domain;

import step.dto.ResultDto;

public class Result {
    private final String result;

    public Result(String result) {
        this.result = result;
    }

    public ResultDto exportResultDto() {
        return new ResultDto(result);
    }
}
