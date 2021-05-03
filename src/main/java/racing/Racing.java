package racing;

import car.Car;
import car.Cars;

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
        List<Car> carList = new ArrayList<Car>();
        for (int i = 0; i < 3; i++) {
            carList.add(new Car(scanner.next()));
        }
        cars = new Cars(carList);
        return cars;
    }

    public void inputLab() {
        Scanner scanner = new Scanner(System.in);
        lab = new Lab(scanner.nextInt());
    }

    public Cars start() {
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

    public void showRacingSituation() {
        for (Car car : cars.getCars()) {
            System.out.println(car.getName() + ":" + car.getStatus());
        }
        for (Car car : cars.getCars()) {
            System.out.println("distance("+ car.getName() +"): " + car.getDistance());
        }
    }


    public void announceWinner() {
        WinnerList winnerList = new WinnerList();
        winner = winnerList.createWinnerList(cars, maxDistance);
        System.out.println( winner.getWinner() + "가 최종 우승했습니다.");
    }

}
