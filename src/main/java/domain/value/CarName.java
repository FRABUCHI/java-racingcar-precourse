package domain.value;

public class CarName {

    private String carName;

    public CarName(String carName) {
        if (0 < carName.length() && carName.length() <= 5) {
            this.carName = carName;
        }
    }

    public String getCarName() {
        return carName;
    }
}
