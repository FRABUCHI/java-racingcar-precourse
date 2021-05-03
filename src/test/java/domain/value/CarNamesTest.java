package domain.value;

import application.value.IsValid;
import domain.CarNames;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;

class CarNamesTest {

    @Test
    void 공백_유효검사() {
        IsValid isValid = new IsValid(true);
        CarNames carNames = new CarNames("abc,     ,cc");
        carNames.isValid();
        assertFalse(isValid.getIsValid());
    }

    @Test
    void Null_유효검사() {
        IsValid isValid = new IsValid(true);
        CarNames carNames = new CarNames("");
        carNames.isValid();
        assertFalse(isValid.getIsValid());
    }
}