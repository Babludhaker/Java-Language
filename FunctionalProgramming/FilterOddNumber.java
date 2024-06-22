package FunctionalProgramming;

import java.util.List;

public class FilterOddNumber {
    public static void main(String[] args) {
        List<Integer> od = List.of(1,2,3,4,5,6,7,8,9,10);

        od.stream().filter(num -> num % 2==1).forEach(num -> System.out.println(num));
    }
}
