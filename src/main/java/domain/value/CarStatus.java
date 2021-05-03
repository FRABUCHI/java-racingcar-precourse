package domain.value;

public enum CarStatus {
    FORWARD, STOP;

    public boolean isForward(CarStatus status) {
        return status == CarStatus.FORWARD;
    }
}
