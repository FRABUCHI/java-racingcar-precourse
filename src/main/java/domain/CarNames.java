package domain;

import application.value.IsValid;
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

    public IsValid isValid() {
        IsValid isValid = new IsValid(true);
        CarNameList carNameList = getCarNameList();
        for (CarName carName : carNameList.getCarNameList()) {
            isValid.setIsValid(checkValidation(carName).getIsValid());
        }
        return isValid;
    }

    private IsValid checkValidation(CarName carName) {
        IsValid isValid = new IsValid(true);

        if (carName.getCarName().isBlank()){
            isValid.setIsValid(false);
        }

        if (carName.getCarName().length() > 5) {
            isValid.setIsValid(false);
        }


        return isValid;
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
