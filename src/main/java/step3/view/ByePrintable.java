package step3.view;

import step3.dto.ByeDto;

class ByePrintable extends Printable {
    ByePrintable(ByeDto byeDto) {
        append(String.format("경과시간: %s", formatMilliSecond(byeDto.getMilliSeconds())));
        append(lineSeparator);
        append(String.format("조작갯수: %d", byeDto.getOperateNumber()));
        append(lineSeparator);
        append(byeDto.getMessage());
    }

    private String formatMilliSecond(long milliSecond) {
        long second = milliSecond / 1000;
        return String.format("%02d:%02d",
                second / 60,
                second % 60);
    }
}
