package racing;

import car.Car;
import car.Cars;
import car.value.CarName;
import racing.value.*;

import java.util.ArrayList;
import java.util.List;
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

    public Cars createCarsList() {
        Scanner scanner = new Scanner(System.in);
        cars = new Cars();
        for (int i = 0; i < 3; i++) {
            cars.addCar(new Car(new CarName(scanner.next())));
        }
        return cars;
    }

    public void inputLab() {
        Scanner scanner = new Scanner(System.in);
        lab = new Lab(scanner.nextInt());
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
