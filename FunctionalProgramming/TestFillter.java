package FunctionalProgramming;

import java.util.*;

public class TestFillter {
    public static void main(String[] args) {
        List<String>list = List.of("Apple","Date","Orange","Mango","Banana");

        list.stream()
        .filter(furite -> furite.endsWith("e") )
         .forEach(furite -> System.out.println(furite));
    }
}
