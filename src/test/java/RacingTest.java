import car.Car;
import car.Cars;
import org.junit.jupiter.api.Test;
import racing.Racing;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RacingTest {

    @Test
    void 참가자_명단_생성() {
        Racing racing = new Racing(3);
        List<Car> carList = Arrays.asList(new Car("weekend"), new Car("week"), new Car("end"));
        Cars cars = racing.createCarsList(carList);
        assertEquals("weekendweekend", cars.toString());
    }

    @Test
    void LAB_입력() {
        Racing racing = new Racing(3);
        int lab = racing.getLab();
        assertEquals(3, lab);
    }

    @Test
    void LAB_단위_자동차별_전진_또는_멈춤() {
        Racing racing = new Racing(3);
        List<Car> carList = Arrays.asList(new Car("weekend"), new Car("week"), new Car("end"));
        Cars cars = racing.createCarsList(carList);
        do {
            cars = racing.start(cars);
            racing.showRacingSituation(cars);
        } while (racing.isNotOver());
    }

}
