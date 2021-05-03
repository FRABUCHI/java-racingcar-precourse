import car.Cars;
import racing.Racing;
import racing.value.Winner;

public class RacingGame {

    Racing racing = new Racing();

    public void start() {
        createCarsList();
        inputLab();
        gameStart();
        announceWinner();
    }

    private void createCarsList() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        racing.createCarsList();
    };

    private void gameStart() {
        System.out.println("실행 결과");
        do {
            racing.start();
            racing.showRacingSituation();
        } while (racing.isNotOver());
    }

    private void inputLab() {
        System.out.println("시도할 회수는 몇회인가요?");
        racing.inputLab();
    };

    private void announceWinner() {
        Winner winner = racing.getWinner();
        System.out.println( winner.getWinner() + "가 최종 우승했습니다.");
    }


}
