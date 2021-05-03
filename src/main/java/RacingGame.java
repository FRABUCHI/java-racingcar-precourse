import car.Cars;
import racing.Racing;

public class RacingGame {

    public void start() {
        Racing racing = new Racing();
        racing.createCarsList();
        racing.inputLab();
        do {
            racing.start();
            racing.showRacingSituation();
        } while (racing.isNotOver());
        racing.announceWinner();
    }

}
