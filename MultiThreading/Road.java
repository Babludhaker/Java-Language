package MultiThreading;

public class Road {
    public static void main(String[] args) {
        TrafficLight red = new TrafficLight(TrafficColor.RED);
        TrafficLight green = new TrafficLight(TrafficColor.GREEN);
        TrafficLight yellow = new TrafficLight(TrafficColor.YELLOW);
        red.start();
        green.start();
        yellow.start();
    }
}
