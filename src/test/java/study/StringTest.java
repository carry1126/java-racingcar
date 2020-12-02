package study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertAll;

public class StringTest {
    @Test
    void split() {
        String[] result = "1,2".split(",");
        assertThat(result).contains("1");
        assertThat(result).containsExactly("1", "2");
    }

    @Test
    void substring() {
        String input = "(1,2)";
        String result = input.substring(1, input.length() - 1);
        assertThat(result).isEqualTo("1,2");
    }

    @Test
    @DisplayName("abc를 String의 charAt() 메소드를 활용해 위치를 벗어난 문자에 접근하면 StringIndexOutOfBoundsException 예외를 반환한다.")
    void charAt() {
        String input = "abc";
/*
        assertThatThrownBy(() -> {
            input.charAt(4);
        }).isInstanceOf(StringIndexOutOfBoundsException.class)
                .hasMessageContaining("Index: 4, Size: 4");
*/
        assertAll(
                () -> assertThatThrownBy(() -> input.charAt(-1)).isExactlyInstanceOf(StringIndexOutOfBoundsException.class),
                () -> assertThatThrownBy(() -> input.charAt(3)).isExactlyInstanceOf(StringIndexOutOfBoundsException.class)
        );
    }
}

