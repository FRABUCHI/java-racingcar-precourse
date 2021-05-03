package racing;

import car.CarNames;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import racing.value.Lab;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RacingTest {

    Racing racing;
    CarNames carNames;

    @BeforeEach
    void setUp() {
        racing = new Racing();

        String carInput = "wkend,week,end";
        InputStream carInputStream = new ByteArrayInputStream(carInput.getBytes());
        System.setIn(carInputStream);

        carNames = racing.inputCarsList();
        racing.createCars(carNames);

        String labInput = "3";
        InputStream inputStream = new ByteArrayInputStream(labInput.getBytes());
        System.setIn(inputStream);

        racing.inputLab();
    }

    @Test
    void 참가자_명단_입력_및_생성_정상() {
        assertEquals("wkend, week, end", carNames.toString());
    }


    @Test
    void LAB_입력() {
        Lab lab = racing.getLab();
        assertEquals(3, lab.getLab());
    }

    @Test
    void LAB_단위_자동차별_전진_또는_멈춤() {
        do {
            racing.start();
            racing.showRacingSituation();
        } while (racing.isNotOver());
    }

    @Test
    void 우승자_발표() {
        do {
            racing.start();
            racing.showRacingSituation();
        } while (racing.isNotOver());
        racing.getWinner();
    }


}
