package step1.view;

import step1.dto.WordDto;

class WordPrintable extends Printable {
    WordPrintable(WordDto wordDto) {
        append(lineSeparator);
        append(wordDto.getWord());
    }
}
