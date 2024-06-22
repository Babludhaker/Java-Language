package MultiThreading.Join;
/* Basically Join are show to when multiple thread are running and t1.join() I mean
  Wait t1 completed task and come in main thread then next thread will execute */
public class TestingJoin implements  Runnable {
    public void run(){
        for (int i = 1; i <=100 ; i++) {
            System.out.printf("%d%c ",i, targetChar);

        }
    }
    private final char targetChar;

    TestingJoin(char targetChar){
        this.targetChar = targetChar;
    }

    public static void main(String[] args) throws InterruptedException {
        TestingJoin j1 = new TestingJoin('*');
        Thread t1  = new Thread(j1);
        t1.start();
        System.out.println("\nThread 1 Started");
        t1.join(); // This will wait for until t1 is completed task
        TestingJoin j2 = new TestingJoin('#');
        new Thread(j2).start();
        System.out.println("\nThread 2 Started");


        TestingJoin j3  = new TestingJoin('$');
        new Thread(j3).start();
        System.out.println("\nThread 3 Started");

    }

}
