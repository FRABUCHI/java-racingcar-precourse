import car.Car;
import car.CarStatus;
import car.Cars;
import org.junit.jupiter.api.Test;
import racing.Racing;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CarTest {

    @Test
    void runTest() {
        Car car = new Car("weekend");
        CarStatus carStatus = car.run();
        assertTrue(carStatus == CarStatus.FORWARD || carStatus == CarStatus.STOP);
    }

}