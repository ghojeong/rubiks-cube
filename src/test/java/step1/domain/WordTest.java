package step1.domain;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import step1.controller.InputParser;
import step1.dto.InputDto;
import step1.exception.BadDirectionException;
import step1.exception.BadDistanceException;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertAll;

class WordTest {
    private String getMovedWord(String input) {
        InputParser parser = InputParser.of(new InputDto(input));
        Word word = new Word(parser.getWord());
        word.move(parser.getPosition(), parser.getDirection());
        return word.exportWordDto().getWord();
    }

    @Test
    @DisplayName("단어 밀어내기가 성공적인 케이스를 테스트")
    void move1() {
        assertAll(
                () -> assertThat(getMovedWord("apple 3 L"))
                        .isEqualTo("leapp"),
                () -> assertThat(getMovedWord("apple 3 l"))
                        .isEqualTo("leapp"),
                () -> assertThat(getMovedWord("banana 6 R"))
                        .isEqualTo("banana"),
                () -> assertThat(getMovedWord("banana 6 r"))
                        .isEqualTo("banana"),
                () -> assertThat(getMovedWord("carrot -1 R"))
                        .isEqualTo("arrotc"),
                () -> assertThat(getMovedWord("carrot -1 r"))
                        .isEqualTo("arrotc"),
                () -> assertThat(getMovedWord("cat -4 R"))
                        .isEqualTo("atc"),
                () -> assertThat(getMovedWord("cat -4 r"))
                        .isEqualTo("atc")
        );
    }

    @ParameterizedTest
    @DisplayName("-100 이상, 100 미만의 숫자가 아니면, BadDistanceException 이 발생한다.")
    @ValueSource(ints = {-102, -101, 100, 101, 102})
    void bad_distance(int distance) {
        Word word = new Word("word");
        assertAll(
                () -> assertThatExceptionOfType(BadDistanceException.class)
                        .isThrownBy(() -> word.move(distance, "L"))
                        .withMessage("-100 이상, 100 미만의 숫자를 입력해야 합니다."),
                () -> assertThatExceptionOfType(BadDistanceException.class)
                        .isThrownBy(() -> word.move(distance, "R"))
                        .withMessage("-100 이상, 100 미만의 숫자를 입력해야 합니다."),
                () -> assertThatExceptionOfType(BadDistanceException.class)
                        .isThrownBy(() -> word.move(distance, "l"))
                        .withMessage("-100 이상, 100 미만의 숫자를 입력해야 합니다."),
                () -> assertThatExceptionOfType(BadDistanceException.class)
                        .isThrownBy(() -> word.move(distance, "r"))
                        .withMessage("-100 이상, 100 미만의 숫자를 입력해야 합니다.")
        );
    }

    @ParameterizedTest
    @DisplayName("L과 R이 아니면, BadDirectionException 이 발생한다.")
    @ValueSource(strings = {"LEFT", "RIGHT"})
    void bad_direction(String direction) {
        Word word = new Word("word");
        int distance = 1;
        assertThatExceptionOfType(BadDirectionException.class)
                .isThrownBy(() -> word.move(distance, direction))
                .withMessage("R,r,L,l 만 입력 가능합니다.");
    }
}
