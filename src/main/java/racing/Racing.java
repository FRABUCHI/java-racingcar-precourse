package racing;

import car.Car;
import car.Cars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Racing {

    private Lab lab;
    private CurrentLab currentLab = new CurrentLab();
    private MaxDistance maxDistance = new MaxDistance();

    public Lab getLab() {
        return lab;
    }

    public Cars createCarsList() {
        Scanner scanner = new Scanner(System.in);
        List<Car> carList = new ArrayList<Car>();
        for (int i = 0; i < 3; i++) {
            carList.add(new Car(scanner.next()));
        }
        return new Cars(carList);
    }

    public void inputLab() {
        Scanner scanner = new Scanner(System.in);
        lab = new Lab(scanner.nextInt());
    }

    public Cars start(Cars cars) {
        for (Car car : cars.getCars()) {
            car.run();
            maxDistance.setMaxDistance(car.getDistance());
        }
        currentLab.addCurrentLab();
        return cars;
    }

    public boolean isNotOver() {
        return !lab.isSame(currentLab);
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
        if (maxDistance.compare(car.getDistance())) {
            carNames.append(car.getName())
                    .append(", ");
        }
        return carNames;
    }

    public void announceWinner(Cars cars) {
        System.out.println( getWinner(cars) + "가 최종 우승했습니다.");
    }

}
