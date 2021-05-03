package racing;

public class Lab {

    private int lab;

    public Lab(int lab) {
        if (lab > 0) {
            this.lab = lab;
        }
    }

    public boolean isSame(CurrentLab currentLab) {
        return lab == currentLab.getCurrentLab();
    }

    public int getLab() {
        return lab;
    }


}
