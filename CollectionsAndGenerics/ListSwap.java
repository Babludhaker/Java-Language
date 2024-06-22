package CollectionsAndGenerics;

import java.util.*;

public class ListSwap {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,4,5,6,6);
        System.out.println(list);
        System.out.println("After Swap List Value");
        swap(list,3,4);
        System.out.println(list);
    }

    public static void swap(List<Integer>list, int a , int b){
        int s = list.get(a);
        list.set(a,list.get(b));
        list.set(b,s);

    }
}
