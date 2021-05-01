public class Car {


    private final String name;

    public Car(String name) {
        this.name = name;
    }

    public CarStatus run() {
        return new Engine().start();
    }

    public String getName() {
        return name;
    }
}
