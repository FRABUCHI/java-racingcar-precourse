package car;

import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
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
