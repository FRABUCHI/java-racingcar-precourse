package racing;

import car.Car;
import car.Cars;

import java.util.ArrayList;
import java.util.List;

public class WinnerList {

    private List<Car> winnerList = new ArrayList<Car>();

    public Winner createWinnerList(Cars cars, MaxDistance maxDistance) {
        for (Car car : cars.getCars()) {
            addWinnerList(car, maxDistance);
        }
        return new Winner(winnerList);
    }
    private void addWinnerList(Car car, MaxDistance maxDistance) {
        if (maxDistance.compare(car.getDistance())) {
            winnerList.add(car);
        }
    }
}
