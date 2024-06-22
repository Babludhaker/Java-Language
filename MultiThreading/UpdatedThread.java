package MultiThreading;

public class UpdatedThread extends Thread {

    private final Counter counter;

    public UpdatedThread(Counter counter){
        this.counter = counter;
    }

    public void run(){
        for (int i = 1; i <=10000 ; i++) {
            counter.increment();

        }
    }
}
