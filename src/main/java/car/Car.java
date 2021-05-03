package car;

public class Car {

    private final String name;
    private int distance;
    private CarStatus status;

    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public CarStatus getStatus() {
        return status;
    }

    public int getDistance() {
        return distance;
    }

    private void addDistance() {
        if (status == CarStatus.FORWARD) {
            distance += 1;
        }
    }

    public CarStatus run() {
        status =  new Engine().start();
        addDistance();
        return status;
    }


}
