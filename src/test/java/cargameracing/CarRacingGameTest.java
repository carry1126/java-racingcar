package cargameracing;

import cargameracing.domain.CarRacingGame;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

public class CarRacingGameTest {
    private CarRacingGame racingGame;

    @BeforeEach
    public void setUp() {
        racingGame = new CarRacingGame(Arrays.asList("tico", "bmw"), 7);
    }

    @Test
    @DisplayName("차의 개수 확인")
    void carCount() {
        assertThat(racingGame.getCars().length).isEqualTo(2);
        assertThat(racingGame.getCars()).hasSize(2);
    }
}
