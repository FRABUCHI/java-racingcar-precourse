package racing;

import car.Car;
import car.Cars;
import org.junit.jupiter.api.Test;
import racing.Racing;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RacingTest {

    @Test
    void 참가자_명단_입력_및_생성() {
        Racing racing = new Racing(3);

        String input = "weekend week end";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        Cars cars = racing.createCarsList();
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

        String input = "weekend week end";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        Cars cars = racing.createCarsList();
        do {
            cars = racing.start(cars);
            racing.showRacingSituation(cars);
        } while (racing.isNotOver());
    }

    @Test
    void 우승자_발표() {
        Racing racing = new Racing(3);

        String input = "weekend week end";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);

        Cars cars = racing.createCarsList();
        do {
            cars = racing.start(cars);
            racing.showRacingSituation(cars);
        } while (racing.isNotOver());
        racing.announceWinner(cars);
    }


}
