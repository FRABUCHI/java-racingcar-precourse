import java.util.Random;

public class Car {
    public boolean isRunning(int num) {
        return num >= 4;
    }

    public int getRpm() {
        Random rpm = new Random();
        return rpm.nextInt(9);
    }
}
