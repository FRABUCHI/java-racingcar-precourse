package car;

import car.value.CarName;
import car.value.CarNameList;

import java.util.Arrays;
import java.util.List;

public class CarNames {

    private String[] carNames;

    public CarNames(String carNames) {
        this.carNames = carNames.split(",");
    }

    public CarNameList getCarNameList() {
        CarNameList carNameList = new CarNameList();
        for (String carName : carNames) {
            carNameList.add(new CarName(carName));
        }
        return carNameList;
    }

    public boolean isValid() {
        for (String carName : carNames) {
            if (!checkValidation(carName)) {
                return false;
            }
        }
        return true;
    }

    private boolean checkValidation(String carName) {
        System.out.println("CarName: "+ carName +" / "+carName.isEmpty());
        if (carName.length() > 5) {
            return false;
        }
        if (carName.isBlank()){
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        carNames.toString();
        StringBuilder carList = new StringBuilder();
        for (String carName : carNames) {
            carList.append(carName).append(", ");
        }
        return carList.toString().substring(0, carList.length() - 2);

    }

}
