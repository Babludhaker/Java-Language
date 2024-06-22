package MultiThreading;

public class TestingSynchronize {
    public static void main(String[] args) throws InterruptedException {
        Counter c = new Counter();
        UpdatedThread t1 = new UpdatedThread(c);
        UpdatedThread t2 = new UpdatedThread(c);
        t1.start();
        t2.start();

        t1.join();
        t1.join();


        System.out.printf("final counter value %d", c.getCount());

    }
}
