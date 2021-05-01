import java.util.List;

public class Racing {

    private final int lab;

    public Racing(int lab) {
        this.lab = lab;
    }

    public Cars createCarsList(List<Car> carList) {
        Cars cars = new Cars(carList);
        return cars;
    }

    public int getLab() {
        return lab;
    }
}
