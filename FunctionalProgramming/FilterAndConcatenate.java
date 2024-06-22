package FunctionalProgramming;

import java.util.List;

public class FilterAndConcatenate {
    public static void main(String[] args) {
        List<String> list = List.of("Bablu", "Deepak ", "HariOM Abhishek Patidar","Ankit Goud","Priyanshu Jain");

      String result =   list.stream().filter(str -> str.length()>10)
                .reduce("",(a,b) -> a+" "+b);

        System.out.printf("The Final result are %s", result);
    }
}
