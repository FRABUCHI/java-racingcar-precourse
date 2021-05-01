import java.util.List;

public class Racing {

    public Cars createCarsList(List<Car> carList) {
        Cars cars = new Cars(carList);
        return cars;
    }
}
