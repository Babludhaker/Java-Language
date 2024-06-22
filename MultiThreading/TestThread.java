package MultiThreading;

public class TestThread extends  Thread{

        public void run() {
            for (int i = 1; i <= 1000; i++) {
                System.out.printf("%d%c ", i, targetChar);

            }
        }

        private final char targetChar;
        TestThread(char targetChar){
            this.targetChar = targetChar;
        }
    public static void main(String[] args) {
            TestThread t1 = new TestThread('*');
            TestThread t2 = new TestThread('+');
            t1.start();
            t2.start();
    }
}
