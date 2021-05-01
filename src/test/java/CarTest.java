import car.Car;
import car.CarStatus;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void runTest() {
        Car car = new Car("weekend");
        CarStatus carStatus = car.run();
        assertTrue(carStatus == CarStatus.FORWARD || carStatus == CarStatus.STOP);
    }
}