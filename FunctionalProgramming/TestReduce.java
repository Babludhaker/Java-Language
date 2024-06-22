package FunctionalProgramming;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestReduce {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,5,2,3,4,5,6,9,8);

       int newSum =  list.stream().reduce(0, (a,b) -> a+b);



        System.out.printf("The sum of %d",newSum);
    }
}
