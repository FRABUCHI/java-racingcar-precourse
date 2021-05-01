package car;

public class Car {

    private final String name;
    private CarStatus status;

    public Car(String name) {
        this.name = name;
    }

    public CarStatus run() {
        status =  new Engine().start();
        return status;
    }

    public String getName() {
        return name;
    }

    public CarStatus getStatus() {
        return status;
    }
}
