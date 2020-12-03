package calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatIllegalArgumentException;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {
    StringCalculator scal = new StringCalculator();

    @Test
    @DisplayName("덧셈 테스트")
    void add() {
        String input = "2 + 3";
        assertThat(scal.calculateInfo(input)).isEqualTo(5);
    }

    @Test
    @DisplayName("minus test")
    void minus() {
        String input = "5 - 3";
        assertThat(scal.calculateInfo(input)).isEqualTo(2);
    }

    @Test
    @DisplayName("multiple test")
    void multiple() {
        String input = "5 * 3";
        assertThat(scal.calculateInfo(input)).isEqualTo(15);
    }

    @Test
    @DisplayName("divide test")
    void divide() {
        String input = "6 / 3";
        assertThat(scal.calculateInfo(input)).isEqualTo(2);
    }

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "4 % 2"})
    @DisplayName("입력 값이 null이거나 빈 공백 문자일 경우, 사칙연산 기호가 아닌 경우 IllegalArgumentException throw")
    void inputNull(String input) {
        assertThatIllegalArgumentException().isThrownBy(() -> {
            scal.validate(input);
        });
    }

    @ParameterizedTest
    @ValueSource(strings = {"2 + 3 * 4 / 2"})
    @DisplayName("사칙연산을 모두 포함하는 기능 구현")
    void fourOperationCheck(String input) {
        assertEquals(10, scal.calculateInfo(input));
    }
}
