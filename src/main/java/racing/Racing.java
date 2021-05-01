package racing;

import car.Car;
import car.Cars;

import java.util.List;

public class Racing {

    private final int lab;

    public Racing(int lab) {
        this.lab = lab;
    }

    public Cars createCarsList(List<Car> carList) {
        return new Cars(carList);
    }

    public int getLab() {
        return lab;
    }

    public RacingSituation start(Cars cars) {
        for (Car car : cars.getCars()) {
            car.run();
        }
        return new RacingSituation(cars);
    }
}
