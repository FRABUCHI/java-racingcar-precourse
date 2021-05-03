import car.Cars;
import racing.Racing;

public class RacingGame {

    public void start() {
        Racing racing = new Racing(3);
        Cars cars = racing.createCarsList();
        do {
            cars = racing.start(cars);
            racing.showRacingSituation(cars);
        } while (racing.isNotOver());
        racing.announceWinner(cars);
    }

}
