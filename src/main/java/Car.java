public class Car {

    private final int MAX_RPM = 9;

    public CarStatus run() {
        return new Engine().start();
    }
}
