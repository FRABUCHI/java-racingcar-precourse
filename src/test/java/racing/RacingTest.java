package racing;

import car.CarNames;
import car.Cars;
import car.value.CarNameList;
import org.junit.jupiter.api.Test;
import racing.value.Lab;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.*;

public class RacingTest {

    @Test
    void 참가자_명단_입력_및_생성_정상() {
        Racing racing = new Racing();

        String carInput = "wkend,week,end";
        InputStream carInputStream = new ByteArrayInputStream(carInput.getBytes());
        System.setIn(carInputStream);

        CarNames carNames = racing.inputCarsList();

        assertEquals("wkend, week, end, ", carNames.toString());
    }


    @Test
    void LAB_입력() {
        Racing racing = new Racing();

        String labInput = "3";
        InputStream inputStream = new ByteArrayInputStream(labInput.getBytes());
        System.setIn(inputStream);

        racing.inputLab();

        Lab lab = racing.getLab();
        assertEquals(3, lab.getLab());
    }

    @Test
    void LAB_단위_자동차별_전진_또는_멈춤() {
        Racing racing = new Racing();

        String carInput = "weekend week end";
        InputStream carInputStream = new ByteArrayInputStream(carInput.getBytes());
        System.setIn(carInputStream);

        racing.inputCarsList();

        String labInput = "3";
        InputStream inputStream = new ByteArrayInputStream(labInput.getBytes());
        System.setIn(inputStream);

        racing.inputLab();

        do {
            racing.start();
            racing.showRacingSituation();
        } while (racing.isNotOver());
    }

    @Test
    void 우승자_발표() {
        Racing racing = new Racing();

        String carInput = "weekend week end";
        InputStream carInputStream = new ByteArrayInputStream(carInput.getBytes());
        System.setIn(carInputStream);

        racing.inputCarsList();

        String labInput = "3";
        InputStream inputStream = new ByteArrayInputStream(labInput.getBytes());
        System.setIn(inputStream);

        racing.inputLab();

        do {
            racing.start();
            racing.showRacingSituation();
        } while (racing.isNotOver());
        racing.getWinner();
    }


}
