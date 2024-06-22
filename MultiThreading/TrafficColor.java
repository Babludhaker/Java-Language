package MultiThreading;

public enum TrafficColor {
    RED(9000),
    GREEN(10000),
    YELLOW(4000);

    private final int timeColor;

    public int getTimeColor() {
        return timeColor;
    }

    TrafficColor(int timeColor) {
        this.timeColor = timeColor;
    }
}
