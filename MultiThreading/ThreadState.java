package MultiThreading;

public class ThreadState extends Thread{

    @Override
    public void run()  {
        try {
            sleep(4000);
            System.out.printf("Inside Thread run %s\n",getState());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    public static void main(String[] args) throws Exception {
        ThreadState t1 = new ThreadState();
        System.out.printf("Thread State: %s\n",t1.getState());
        t1.start();

        t1.join();
        System.out.printf("Thread State: %s\n",t1.getState());

    }
}
