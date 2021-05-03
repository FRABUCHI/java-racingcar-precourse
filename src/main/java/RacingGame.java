import car.CarNames;
import racing.Racing;
import racing.value.Lab;
import racing.value.Winner;

public class RacingGame {

    Racing racing = new Racing();

    public void start() {
        inputCarsList();
        inputLab();
        gameStart();
        announceWinner();
    }

    private void inputCarsList() {
        CarNames carNames;
        do {
            System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
            carNames = racing.inputCarsList();
        } while(!isValidCarNames(carNames));
        racing.createCars(carNames);
    }

    private boolean isValidCarNames(CarNames carNames) {
        return carNames.isValid();
    }

    private void inputLab() {
        Lab lab;
        do {
            System.out.println("시도할 회수는 몇회인가요?");
            lab = racing.inputLab();
        } while (!isValidLab(lab));
    }

    private boolean isValidLab(Lab lab) {
        return lab.isValid();
    }

    private void gameStart() {
        System.out.println("실행 결과");
        do {
            racing.start();
            racing.showRacingSituation();
        } while (racing.isNotOver());
    }

    private void announceWinner() {
        Winner winner = racing.getWinner();
        System.out.println( winner.getWinner() + "가 최종 우승했습니다.");
    }


}
