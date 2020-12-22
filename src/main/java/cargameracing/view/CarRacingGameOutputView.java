package cargameracing.view;

import cargameracing.domain.Car;

import java.util.List;

/**
 * View Role
 * @author minji
 */
public class CarRacingGameOutputView {
    public static void displayResult(Car[] cars) {
        for (int i = 0; i < cars.length; i++) {
            gameResult(cars[i]);
            System.out.println();
        }
    }

    public static void gameResult(Car car) {
        int junjinCount = car.getJunjin();
        System.out.print(car.getName() + " : ");
        for (int j = 0; j < junjinCount; j++) {
            System.out.print("-");
        }
    }

    public static void displayFinalWinners(List<Car> winners) {
        for (int i = 0; i < winners.size(); i++) {
            if (i != winners.size() - 1) {
                System.out.print(winners.get(i).getName() + ", ");
            }
            if (i == winners.size() - 1) {
                System.out.print(winners.get(i).getName());
            }
        }
        System.out.print("가 최종 우승했습니다.");
    }
}
