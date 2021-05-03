package racing;

public class CurrentLab {
    private int currentLab = 0;

    public void addCurrentLab() {
        currentLab = currentLab + 1;
    }

    public int getCurrentLab() {
        return currentLab;
    }
}
