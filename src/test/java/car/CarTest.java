package car;

import car.value.CarStatus;
import car.value.CarName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CarTest {

    @Test
    void runTest() {
        Car car = new Car(new CarName("weekend"));
        CarStatus carStatus = car.run();
        assertTrue(carStatus == CarStatus.FORWARD || carStatus == CarStatus.STOP);
    }

}