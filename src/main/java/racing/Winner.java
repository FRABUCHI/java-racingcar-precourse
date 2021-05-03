package racing;

import car.Car;

import java.util.List;

public class Winner {

    private String winner = "";

    public Winner(List<Car> winnerList) {
        for (Car car : winnerList) {
            winner += car.getName() + ", ";
        }
        winner = winner.substring(0, winner.length() - 2);
    }

    public String getWinner() {
        return winner;
    }
}
