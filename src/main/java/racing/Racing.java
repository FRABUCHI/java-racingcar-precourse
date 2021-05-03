package racing;

import car.Car;
import car.Cars;

import java.util.List;

public class Racing {

    private final int lab;
    private int currentLab;

    private int maxDistance;

    public Racing(int lab) {
        this.lab = lab;
    }

    public int getLab() {
        return lab;
    }

    public Cars createCarsList(List<Car> carList) {
        return new Cars(carList);
    }

    public Cars start(Cars cars) {
        for (Car car : cars.getCars()) {
            car.run();
            setMaxDistance(car.getDistance());
        }
        addCurrentLab();
        return cars;
    }

    public void setMaxDistance(int distance) {
        if (distance >= maxDistance) {
            maxDistance = distance;
        }
    }

    public void addCurrentLab() {
        currentLab = currentLab + 1;
    }

    public boolean isNotOver() {
        return currentLab != lab;
    }

    public void showRacingSituation(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.println(car.getName() + ":" + car.getStatus());
        }
        for (Car car : cars.getCars()) {
            System.out.println("distance("+ car.getName() +"): " + car.getDistance());
        }
    }

    private String getWinner(Cars cars) {
        StringBuilder carNames = new StringBuilder();
        for (Car car : cars.getCars()) {
            createWinnerNameString(carNames, car);
        }
        return carNames.substring(0, carNames.length() - 2);
    }

    private StringBuilder createWinnerNameString(StringBuilder carNames, Car car) {
        if (car.getDistance() == maxDistance) {
            carNames.append(car.getName())
                    .append(", ");
        }
        return carNames;
    }

    public void announceWinner(Cars cars) {
        System.out.println( getWinner(cars) + "가 최종 우승했습니다.");
    }

}
