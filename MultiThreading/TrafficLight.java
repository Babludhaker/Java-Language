package MultiThreading;

public class TrafficLight extends Thread{
    private final TrafficColor color;
    private static final Object lock = new Object();

    TrafficLight(TrafficColor color){
        this.color = color;
    }

    public  void run() {
        synchronized (lock) {
            System.out.printf("%s active\n", color);
            try {
                Thread.sleep(color.getTimeColor());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.printf("%s Inactive Color\n", color);
        }
    }


}
