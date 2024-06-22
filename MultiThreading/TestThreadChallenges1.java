package MultiThreading;

public class TestThreadChallenges1 {
    public static void main(String[] args) {
        ChallengesThread t1 = new ChallengesThread(1);
        ChallengesThread t2 = new ChallengesThread(2);

        t1.start();
        t2.start();
    }
}
