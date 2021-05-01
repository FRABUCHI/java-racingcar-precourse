package racing;

import car.Car;
import car.CarStatus;
import car.Cars;

import java.util.ArrayList;
import java.util.List;

public class RacingSituation {

    private final List<CarStatus> racingSituation = new ArrayList<CarStatus>();

    public RacingSituation(Cars cars) {
        for (Car car : cars.getCars()) {
            racingSituation.add(car.getStatus());
        }
    }

    public List<CarStatus> getRacingSituation() {
        return racingSituation;
    }
}
