package domain;

import domain.value.CarName;
import domain.value.CarNameList;

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
