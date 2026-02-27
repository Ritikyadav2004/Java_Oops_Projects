package JavaCollections;
import java.util.*;
import JavaCollections.Linkedlist;
 
    public class Linkedlist{
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(5);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        list.addFirst(10);
        list.addLast(11);
        System.out.println(list);
        list.remove(Integer.valueOf(11));
        System.out.println(list);
        list.set(4,99);
        System.out.println(list);
        Collections.sort(list);
        System.err.println(list);


        System.out.println(list.get(5));
    }
}
