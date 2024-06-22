package FunctionalProgramming;

import java.util.function.BinaryOperator;

public class MultiplicationLambda {
    public static void main(String[] args) {
        BinaryOperator<Integer> multi =  (a,b) -> a*b;
        int result = multi.apply(4,6);
        System.out.printf("Lambda multiply value after %d",result);
    }
}
