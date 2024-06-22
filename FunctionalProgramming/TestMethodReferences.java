package FunctionalProgramming;

import java.util.List;

public class TestMethodReferences {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

        list.stream().filter(num -> num % 2==1)
                .forEach(System.out::println);

        int newSum = list.stream().reduce(0,Integer::sum);
        System.out.println(newSum);
    }
}
