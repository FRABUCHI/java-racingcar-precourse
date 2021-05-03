package domain;

import domain.value.CarName;
import domain.value.CarStatus;
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