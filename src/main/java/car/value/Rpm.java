package car.value;

import java.util.Random;

public class Rpm {

    private final int rpm;
    private static final int MIN_RPM = 4;
    private static final int MAX_RPM = 9;

    public Rpm() {
        Random random = new Random();
        this.rpm = random.nextInt(MAX_RPM);
    }

    public boolean isOverThanMinimumRpm() {
        return rpm >= MIN_RPM;

    }
}
