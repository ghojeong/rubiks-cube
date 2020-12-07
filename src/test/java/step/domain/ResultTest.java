package step.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ResultTest {

    private final String helloWorld = "Hello World!";
    private Result result;

    @BeforeEach
    void setUp() {
        result = new Result(helloWorld);
    }

    @Test
    void exportResultDto() {
        assertThat(result.exportResultDto().getResult())
                .isEqualTo(helloWorld);
    }
}
