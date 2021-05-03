package domain;

import domain.value.CarName;
import domain.value.CarStatus;
import domain.value.MoveDistance;
import domain.value.Rpm;

public class Car {

    private final CarName carName;
    private final MoveDistance moveDistance;
    private CarStatus status;
    private Rpm rpm;

    public Car(CarName carName) {
        this.carName = carName;
        moveDistance = new MoveDistance();
    }

    public CarStatus run() {
        rpm = new Rpm();
        status =  rpm.isOverThanMinimumRpm() ? CarStatus.FORWARD : CarStatus.STOP;
        addMoveDistance();
        return status;
    }

    public String getName() {
        return carName.getCarName();
    }

    public CarStatus getStatus() {
        return status;
    }

    public int getMoveDistance() {
        return moveDistance.getMoveDistance();
    }

    private void addMoveDistance() {
        if (status.isForward(status)) {
            moveDistance.addDistance();
        }
    }




}
