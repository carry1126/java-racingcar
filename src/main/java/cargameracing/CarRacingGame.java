package cargameracing;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * Domain(Model) Role
 * @author minji
 */
public class CarRacingGame {
    Car[] cars;
    Random random = new Random();

    public CarRacingGame(int carCount) {
        cars = new Car[carCount];
        for (int i = 0; i < carCount; i++) {
            cars[i] = new Car();
        }
    }

    public void playGame() {
        for (int j = 0; j < cars.length; j++) {
            int num = randomValue();
            cars[j].junjinUp(num);
        }

        //Java8 Stream API 이용
/*
        IntStream.range(0, cars.length)
                .forEach(index -> cars[index].junjinUp(num));
*/

    }

    protected int randomValue() {
        return random.nextInt(10);
    }

    public Car[] getCars() {
        return cars;
    }

}
