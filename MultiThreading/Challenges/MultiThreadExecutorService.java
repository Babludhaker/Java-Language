package MultiThreading.Challenges;

import java.sql.Time;
import java.util.concurrent.*;
import java.util.concurrent.*;

public class MultiThreadExecutorService {
    public static void main(String[] args) {
       try(ExecutorService service = Executors.newFixedThreadPool(3)){
           for (int i = 0; i < 10; i++) {
               SleepTask task = new SleepTask();
               service.submit(task);

           }

       }

    }
}
