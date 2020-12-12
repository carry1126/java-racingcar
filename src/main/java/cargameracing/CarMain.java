package cargameracing;

import java.util.Random;
import java.util.Scanner;

/**
 * Controller Role
 * @author minji
 */
public class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("자동차 대수는 몇 대 인가요?");
        String value = scanner.nextLine();
        int carCount = Integer.parseInt(value);
        System.out.println("시도할 회수는 몇 회 인가요?");
        int playCount = scanner.nextInt();

        // CarRacingGameInputView : 입력 View 객체
        CarRacingGameInputView input = new CarRacingGameInputView(carCount, playCount);
        carCount = input.getCarCount();
        playCount = input.getPlayCount();

        // CarRacingGame : 도메인 객체 (자동차 경주 게임에 대한 역할 담당)
        CarRacingGame carRacingGame = new CarRacingGame(carCount);
        System.out.println("실행 결과");
        for (int i = 0; i < playCount; i++) {
            carRacingGame.playGame();
            // CarRacingGameOutputView : 출력 View 객체
            CarRacingGameOutputView.displayResult(carRacingGame.getCars());
            System.out.println();
        }
    }
}
