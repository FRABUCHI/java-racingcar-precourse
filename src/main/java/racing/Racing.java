package racing;

import car.Car;
import car.Cars;

import java.util.List;

public class Racing {

    private final int lab;
    private int currentLab;

    public Racing(int lab) {
        this.lab = lab;
    }

    public int getLab() {
        return lab;
    }

    public Cars createCarsList(List<Car> carList) {
        return new Cars(carList);
    }

    public Cars start(Cars cars) {
        for (Car car : cars.getCars()) {
            car.run();
        }
        currentLab += 1;
        return cars;
    }

    public boolean isNotOver() {
        return currentLab != lab;
    }

    public void showRacingSituation(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.println(car.getName() + ":" + car.getStatus());
        }
        for (Car car : cars.getCars()) {
            System.out.println("distance("+ car.getName() +"): " + car.getDistance());
        }
    }
}
