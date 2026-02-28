package JavaCollections;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDataStructure {
    public static void  main(String[] args) {
        Queue<Integer> queue=new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        System.out.println(queue);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        
        for (Integer integer : queue) {
            System.out.print(integer+",");
            
        }

    }
}
