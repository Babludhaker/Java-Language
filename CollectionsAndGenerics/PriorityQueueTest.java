package CollectionsAndGenerics;

import java.util.*;
import java.util.*;

public class PriorityQueueTest {
    public static void main(String[] args) {
       PriorityQueue<Student> pq = new PriorityQueue<>(new Comparator<Student>() {
           @Override
           public int compare(Student o1, Student o2) {
               return o2.getGrade() - o1.getGrade();
           }
       });
       pq.offer(new Student("Bablu",'A'));
       pq.offer(new Student("Rahul",'B'));
       pq.offer(new Student("Abhi",'C'));

        System.out.printf("Queue is %s\n",pq);

        System.out.printf("Got %s\n",pq.poll());
        System.out.printf("Got %s\n",pq.poll());
        System.out.printf("Got %s\n",pq.poll());
    }

    private  static  class Student{
        private final String name;
        private  final char grade;
        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }
        public String getName() {
            return name;
        }
        public char getGrade() {
            return grade;
        }

        public String toString(){
            return name +": "+ grade;
        }
    }
}
