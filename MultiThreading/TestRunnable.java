package MultiThreading;

public class TestRunnable implements  Runnable{
    public void run(){
        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d%c ", i, targetChar);

        }
        System.out.println();
    }

    private final char targetChar;
    TestRunnable(char targetChar){
        this.targetChar = targetChar;
    }

    public static void main(String[] args) {
        TestRunnable p1 = new TestRunnable('*');
        Thread t1 = new Thread(p1);
        t1.start();
        TestRunnable p2 = new TestRunnable('#');
        new Thread(p2).start();
    }

}
