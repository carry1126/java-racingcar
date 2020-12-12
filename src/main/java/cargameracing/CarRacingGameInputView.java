package cargameracing;

import java.util.Scanner;

/**
 * View Role
 * @author minji
 */
public class CarRacingGameInputView {
    int carCount;
    int playCount;

    CarRacingGameInputView(int carCount, int playCount) {
        this.carCount = carCount;
        this.playCount = playCount;
    }

    public int getCarCount() {
        return carCount;
    }

    public int getPlayCount() {
        return playCount;
    }

}
