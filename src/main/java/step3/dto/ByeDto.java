package step3.dto;

public class ByeDto {
    private final long milliSeconds;
    private final int operateNumber;
    private final String message;

    public ByeDto(long milliSeconds, int operateNumber, String message) {
        this.milliSeconds = milliSeconds;
        this.operateNumber = operateNumber;
        this.message = message;
    }

    public long getMilliSeconds() {
        return milliSeconds;
    }

    public int getOperateNumber() {
        return operateNumber;
    }

    public String getMessage() {
        return message;
    }
}
