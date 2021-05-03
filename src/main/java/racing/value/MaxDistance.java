package racing.value;

public class MaxDistance {

    private int maxDistance;

    public void setMaxDistance(int distance) {
        if (distance >= maxDistance) {
            maxDistance = distance;
        }
    }

    public boolean compare(int distance) {
        return maxDistance == distance;
    }
}
