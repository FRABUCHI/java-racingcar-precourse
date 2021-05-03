package car.value;

import java.util.ArrayList;
import java.util.List;

public class CarNameList {


    private List<CarName> carNameList = new ArrayList<CarName>();

    public List<CarName> getCarNameList() {
        return carNameList;
    }

    public void add(CarName carName) {
        carNameList.add(carName);
    }

    @Override
    public String toString() {
        return "CarNameList{" +
                "carNameList=" + carNameList +
                '}';
    }
}
