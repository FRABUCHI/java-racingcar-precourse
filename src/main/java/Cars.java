import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }


    @Override
    public String toString() {
        String carList = "";
        for (Car car : cars) {
            carList += car.getName();
        }
        return carList;
    }
}
