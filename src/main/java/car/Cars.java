package car;

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

    @Override
    public String toString() {
        StringBuilder carList = new StringBuilder();
        for (Car car : cars) {
            carList.append(car.getName());
        }
        return carList.toString();
    }

}
