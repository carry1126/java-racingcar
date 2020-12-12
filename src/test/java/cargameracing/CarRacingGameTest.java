package cargameracing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarRacingGameTest {
    private CarRacingGame racingGame;

    @BeforeEach
    void setUp() {
        racingGame = new CarRacingGame(3);
    }

    @Test
    @DisplayName("차의 개수 확인")
    void carCount() {
        assertThat(racingGame.cars.length).isEqualTo(3);
        assertThat(racingGame.getCars()).hasSize(3);
    }

    @Test
    @DisplayName("차의 전진수 확인")
    void playGame() {
        assertThat(racingGame.cars[0].getJunjin()).isEqualTo(0);
        assertThat(racingGame.cars[1].getJunjin()).isEqualTo(0);
        assertThat(racingGame.cars[2].getJunjin()).isEqualTo(0);

    }

    @Test
    @DisplayName("랜덤 값이 4이상인지 확인")
    void randomValue() {
        CarRacingGame racingGame = new CarRacingGame(3) {
          @Override
          protected  int randomValue() {
              return 5;
          }
        };
        
        assertThat(racingGame.randomValue()).isGreaterThanOrEqualTo(4);
    }
}
