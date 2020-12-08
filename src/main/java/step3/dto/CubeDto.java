package step3.dto;

public class CubeDto {
    private final char[][][] cube;

    public CubeDto(char[][][] cube) {
        this.cube = cube;
    }

    public char[][][] getCube() {
        return cube;
    }
}
