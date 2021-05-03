package racing;

import car.Car;
import car.CarNames;
import car.Cars;
import car.value.CarName;
import car.value.CarNameList;
import racing.value.*;

import java.util.Scanner;

public class Racing {

    private Lab lab;
    private Cars cars;
    private CurrentLab currentLab = new CurrentLab();
    private MaxDistance maxDistance = new MaxDistance();
    private Winner winner;

    public Lab getLab() {
        return lab;
    }

    public CarNames inputCarsList() {
        Scanner scanner = new Scanner(System.in);
        cars = new Cars();
        return new CarNames(scanner.nextLine());
    }

    public void createCars(CarNames carNames) {
        CarNameList carNameList = carNames.getCarNameList();
        for (CarName carName : carNameList.getCarNameList()) {
            cars.addCar(new Car(carName));
        }
    }

    public Lab inputLab() {
        Scanner scanner = new Scanner(System.in);
        lab = new Lab(scanner.nextInt());
        return lab;
    }

    public Cars start() {
        for (Car car : cars.getCars()) {
            car.run();
            maxDistance.setMaxDistance(car.getMoveDistance());
        }
        currentLab.addCurrentLab();
        return cars;
    }

    public boolean isNotOver() {
        return !lab.isSame(currentLab);
    }

    public void showRacingSituation() {
        for (Car car : cars.getCars()) {
            System.out.println(car.getName() + ":" + car.getStatus());
        }
        System.out.println();
    }

    public Winner getWinner() {
        WinnerList winnerList = new WinnerList();
        winner = winnerList.createWinnerList(cars, maxDistance);
        return winner;
    }

}
