package CollectionsAndGenerics;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
    public static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        q.add("Bablu ");
        q.add("Dhakad ");
        q.add("Saroda");
        Utility.print(q);
    }
}
