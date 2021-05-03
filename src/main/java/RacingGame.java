import car.Cars;
import racing.Racing;

public class RacingGame {

    public void start() {
        Racing racing = new Racing();
        racing.inputLab();
        racing.createCarsList();
        do {
            racing.start();
            racing.showRacingSituation();
        } while (racing.isNotOver());
        racing.announceWinner();
    }

}
