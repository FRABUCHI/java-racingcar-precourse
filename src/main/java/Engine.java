import java.util.Random;

public class Engine {

    private final int rpm;
    private static final int MIN_RPM = 4;
    private static final int MAX_RPM = 9;

    public Engine() {
        Random random = new Random();
        this.rpm = random.nextInt(MAX_RPM);
    }

    public CarStatus start() {
        return (rpm >= MIN_RPM) ? CarStatus.FORWARD : CarStatus.STOP;
    }

}
