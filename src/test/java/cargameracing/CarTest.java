package cargameracing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * UnitTest
 * @author minji
 */
public class CarTest {
    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car();
    }

    @Test
    @DisplayName("랜덤값이 4 이상 값인지 체크")
    void randomValue() {
        Car car = new Car() {
            @Override
            protected int randomValue() {
                return 4;
            }
        };
        assertThat(car.randomValue()).isGreaterThanOrEqualTo(3);
    }
}