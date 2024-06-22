package Enumeration.Challenges;

public class EnumTest {
    public static void main(String[] args) {
        for (Day value : Day.values()) {
            System.out.printf("%s %s\n", value, value.GetType());
            
        }

    }
}
