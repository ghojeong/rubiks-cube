package step1.domain;

import step1.dto.WordDto;
import step1.exception.BadDirectionException;
import step1.exception.BadDistanceException;

public class Word {
    private String word;

    public Word(String word) {
        this.word = word;
    }

    public void move(int distance, String direction) {
        validateMove(distance, direction);
        int position = getPosition(distance, Direction.valueOf(direction.toUpperCase()));
        word = word.substring(position)
                + word.substring(0, position);
    }

    private int getPosition(int distance, Direction direction) {
        int length = word.length();
        int position = distance * direction.getCartesian() % length;
        if (position < 0) {
            position += length;
        }
        return position;
    }

    private void validateMove(int distance, String direction) {
        if (distance < -100 || distance >= 100) {
            throw new BadDistanceException("-100 이상, 100 미만의 숫자를 입력해야 합니다.");
        }
        String upperDirection = direction.toUpperCase();
        if (!upperDirection.equals("R") && !upperDirection.equals("L")) {
            throw new BadDirectionException("R,r,L,l 만 입력 가능합니다.");
        }
    }

    public WordDto exportWordDto() {
        return new WordDto(word);
    }
}
