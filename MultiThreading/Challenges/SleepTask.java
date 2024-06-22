package MultiThreading.Challenges;

public class SleepTask implements Runnable{
    public void run(){
        Thread current = Thread.currentThread();
        System.out.printf("Started with Thread %s",current.getName());
        try{
            Thread.sleep(getRandom()*1000);
        } catch (InterruptedException e){
            throw new RuntimeException(e);
        }
        System.out.printf("Ended Thread with :  %s",current.getName());

    }

    private int getRandom(){
        double ranNum = Math.random() *5 +1;
        return (int)ranNum;
    }
}
