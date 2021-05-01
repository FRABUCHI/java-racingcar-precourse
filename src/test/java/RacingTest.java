import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class RacingTest {

    @Test
    void 참가자_명단_생성() {
        Racing racing = new Racing();
        List<Car> carList = Arrays.asList(new Car("weekend"), new Car("week"), new Car("end"));
        Cars cars = racing.createCarsList(carList);
        assertEquals("weekendweekend", cars.toString());
    }
}
