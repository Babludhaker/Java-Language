package FunctionalProgramming;

import java.util.List;

public class StreamTest {
    public static void main(String[] args) {
        List<String> list = List.of("bablu","Rahul","Abhi");
        list.stream().forEach(name -> System.out.println(name));
    }
}
