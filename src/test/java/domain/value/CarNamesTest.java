package domain.value;

import domain.CarNames;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class CarNamesTest {

    @Test
    void 공백_유효검사() {
        CarNames carNames = new CarNames("abc,     ,cc");
        System.out.println(carNames.toString());
        boolean result = carNames.isValid();
        assertFalse(result);

    }

    @Test
    void Null_유효검사() {
        CarNames carNames = new CarNames("");
        boolean result = carNames.isValid();
        assertFalse(result);
    }
}