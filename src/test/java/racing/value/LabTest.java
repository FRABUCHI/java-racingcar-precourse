package racing.value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LabTest {

    @Test
    void LAB_정상() {
        Lab lab = new Lab(3);
        assertTrue(lab.isValid());
    }

    @Test
    void LAB_오류() {
        Lab lab = new Lab(-1);
        assertFalse(lab.isValid());
    }
}