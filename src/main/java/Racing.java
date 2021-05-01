import java.util.ArrayList;
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

    public List<CarStatus> start(Cars cars) {
        List<CarStatus> carStatusList = new ArrayList<CarStatus>();
        for (Car car : cars.getCars()) {
            carStatusList.add(car.run());
        }
        return carStatusList;
    }
}
