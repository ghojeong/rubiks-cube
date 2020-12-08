package step2.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SquareTest {
    private Square square;

    @BeforeEach
    void setUp() {
        square = new Square();
    }

    @Test
    @DisplayName("가장 윗줄을 왼쪽으로 한 칸 밀기")
    void U() {
        square.move(SquareMove.U);
        char[][] expected = new char[3][3];

        expected[0][0] = 'R';
        expected[0][1] = 'W';
        expected[0][2] = 'R';

        expected[1][0] = 'G';
        expected[1][1] = 'C';
        expected[1][2] = 'W';

        expected[2][0] = 'G';
        expected[2][1] = 'B';
        expected[2][2] = 'B';

        assertThat(square.exportSquareDto().getSquare())
                .isEqualTo(expected);
    }

    @Test
    @DisplayName("가장 윗줄을 오른쪽으로 한 칸 밀기")
    void U_() {
        square.move(SquareMove.u);
        char[][] expected = new char[3][3];

        expected[0][0] = 'W';
        expected[0][1] = 'R';
        expected[0][2] = 'R';

        expected[1][0] = 'G';
        expected[1][1] = 'C';
        expected[1][2] = 'W';

        expected[2][0] = 'G';
        expected[2][1] = 'B';
        expected[2][2] = 'B';

        assertThat(square.exportSquareDto().getSquare())
                .isEqualTo(expected);
    }

    @Test
    @DisplayName("가장 오른쪽 줄을 위로 한 칸 밀기")
    void R() {
        square.move(SquareMove.R);
        char[][] expected = new char[3][3];

        expected[0][0] = 'R';
        expected[0][1] = 'R';
        expected[0][2] = 'W';

        expected[1][0] = 'G';
        expected[1][1] = 'C';
        expected[1][2] = 'B';

        expected[2][0] = 'G';
        expected[2][1] = 'B';
        expected[2][2] = 'W';

        assertThat(square.exportSquareDto().getSquare())
                .isEqualTo(expected);
    }

    @Test
    @DisplayName("가장 오른쪽 줄을 아래로 한 칸 밀기")
    void R_() {
        square.move(SquareMove.r);
        char[][] expected = new char[3][3];

        expected[0][0] = 'R';
        expected[0][1] = 'R';
        expected[0][2] = 'B';

        expected[1][0] = 'G';
        expected[1][1] = 'C';
        expected[1][2] = 'W';

        expected[2][0] = 'G';
        expected[2][1] = 'B';
        expected[2][2] = 'W';

        assertThat(square.exportSquareDto().getSquare())
                .isEqualTo(expected);
    }

    @Test
    @DisplayName("가장 왼쪽 줄을 아래로 한 칸 밀기")
    void L() {
        square.move(SquareMove.L);
        char[][] expected = new char[3][3];

        expected[0][0] = 'G';
        expected[0][1] = 'R';
        expected[0][2] = 'W';

        expected[1][0] = 'R';
        expected[1][1] = 'C';
        expected[1][2] = 'W';

        expected[2][0] = 'G';
        expected[2][1] = 'B';
        expected[2][2] = 'B';

        assertThat(square.exportSquareDto().getSquare())
                .isEqualTo(expected);
    }

    @Test
    @DisplayName("가장 왼쪽 줄을 위로 한 칸 밀기")
    void L_() {
        square.move(SquareMove.l);
        char[][] expected = new char[3][3];

        expected[0][0] = 'G';
        expected[0][1] = 'R';
        expected[0][2] = 'W';

        expected[1][0] = 'G';
        expected[1][1] = 'C';
        expected[1][2] = 'W';

        expected[2][0] = 'R';
        expected[2][1] = 'B';
        expected[2][2] = 'B';

        assertThat(square.exportSquareDto().getSquare())
                .isEqualTo(expected);
    }

    @Test
    @DisplayName("가장 아랫줄을 오른쪽으로 한 칸 밀기")
    void B() {
        square.move(SquareMove.B);
        char[][] expected = new char[3][3];

        expected[0][0] = 'R';
        expected[0][1] = 'R';
        expected[0][2] = 'W';

        expected[1][0] = 'G';
        expected[1][1] = 'C';
        expected[1][2] = 'W';

        expected[2][0] = 'B';
        expected[2][1] = 'G';
        expected[2][2] = 'B';

        assertThat(square.exportSquareDto().getSquare())
                .isEqualTo(expected);
    }

    @Test
    @DisplayName("가장 아랫줄을 왼쪽으로 한 칸 밀기")
    void B_() {
        square.move(SquareMove.b);
        char[][] expected = new char[3][3];

        expected[0][0] = 'R';
        expected[0][1] = 'R';
        expected[0][2] = 'W';

        expected[1][0] = 'G';
        expected[1][1] = 'C';
        expected[1][2] = 'W';

        expected[2][0] = 'B';
        expected[2][1] = 'B';
        expected[2][2] = 'G';

        assertThat(square.exportSquareDto().getSquare())
                .isEqualTo(expected);
    }
}
