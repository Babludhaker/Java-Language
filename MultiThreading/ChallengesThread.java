package MultiThreading;

public class ChallengesThread extends Thread {

    private  final int ThreadNumber;

    public ChallengesThread(int ThreadNumber){
        this.ThreadNumber = ThreadNumber;
    }
    public void run(){
        for (int i = 0; i <10 ; i++) {
            System.out.printf("Hello Thread-%d\n",ThreadNumber);

        }
    }

}
