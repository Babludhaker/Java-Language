package MultiThreading;

public class NeedOfMultithreading {
    public static void main(String[] args) {
        long start = System.currentTimeMillis(); // Check how system take time to run program
        //First Task
        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.print("\n* Task Completed");

        //Second Task
        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d+ ",i);
        }
        System.out.print("\n+ Task Completed");

        //Third Task
        for (int i = 1; i <=1000 ; i++) {
            System.out.printf("%d# ",i);
        }
        System.out.print("\n# Task Completed\n");

        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
