package domain;

import java.util.ArrayList;
import java.util.List;

public class Cars {

    private final List<Car> cars = new ArrayList<Car>();

    public List<Car> getCars() {
        return cars;
    }

    public void addCar(Car car) {
        cars.add(car);
    }

}
