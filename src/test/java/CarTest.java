
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    @Test
    void 자동차_전진_확인() {
        Car car = new Car();
        boolean isRunning = car.isRunning(4);
        assertTrue(isRunning);
    }

    @Test
    void 자동차_멈춤_확인() {
        Car car = new Car();
        boolean isRunning = car.isRunning(3);
        assertFalse(isRunning);
    }

    @Test
    void 랜덤값_구하기() {
        Car car = new Car();
        int rpm = car.getRpm();
        assertTrue(0 <= rpm && rpm <= 9);
    }
}
