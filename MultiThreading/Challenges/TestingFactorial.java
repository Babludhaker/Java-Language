package MultiThreading.Challenges;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
 

public class TestingFactorial {
    public static void main(String[] args) {
        try(ExecutorService service = Executors.newFixedThreadPool(3)){
            List<Future<Integer>> list = new ArrayList<>();
            for (int i = 0; i <10 ; i++) {
                FactorialCalculator fc = new FactorialCalculator(i);
                list.add(service.submit(fc));

            }

            for (Future<Integer> future : list){
                System.out.printf("Result is %d\n",future.get());
            }
            if (service.awaitTermination(10, TimeUnit.SECONDS)) {
                service.shutdown();
            }
        } catch (ExecutionException  | InterruptedException e ) {
            throw new RuntimeException(e);
        }
    }
}
