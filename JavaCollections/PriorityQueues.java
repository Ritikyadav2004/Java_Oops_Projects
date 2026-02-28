package JavaCollections;
import java.util.*;


public class PriorityQueues {
   public static void main(String[] args) {
     Queue<Integer> pq= new PriorityQueue<>();
     //BY DEFUALT IT STORES IN MIN HEAP DATA STRUCTURR 
     pq.offer(2);
     pq.offer(4);
     pq.offer(3);
     pq.offer(1);
   
    System.out.println(pq);

    System.out.println();
      System.out.println(pq.peek());
     pq.poll();
     // removed 1 
     System.out.println(pq.peek());


     // REVERSE ORDER 
System.out.println("We will se thr implementtation of reverse order queue using Collection");
    //  Queue<Integer> Maxpq= new PriorityQueue<>(Collections.reverseOrder());
    //ALTERNATIVE OF CODE 
     Queue<Integer> Maxpq= new PriorityQueue<>((Integer a,Integer b)->(b-a));
     Maxpq.offer(2);
     Maxpq.offer(4);
     Maxpq.offer(3);
     Maxpq.offer(1);
     System.out.println(Maxpq);

     System.out.println();
     System.out.println(Maxpq.peek());

    Maxpq.poll(); //REMOVED MAX ELEMNT AS ITS HAVE HIGER PRIORTY
    System.out.println(Maxpq.peek());








   }

}
