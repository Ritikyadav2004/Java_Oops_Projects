package JavaCollections;
import java.util.*;
public class Deques {
    public static void main(String[] args)
    {
        Deque<Integer> deck= new LinkedList<>();
        deck.offer(1);
        deck.offer(2);
        deck.offer(3);
        System.out.println(deck);
        deck.offerLast(4);
        System.out.println(deck);
        deck.offerFirst(0);
        System.out.println(deck);


        // REMOVING THE ELEMENT
        //BY DEFUALT POLL ELEMINT FIRST ELEMENT
        System.out.println(deck.poll());  // removing first elemnt 
        System.out.println(deck.pollLast()); // remove last elemnt
        System.out.println(deck.pollFirst());  // removing first elemnt 




        System.out.println("Peek Elemnt "+deck.peek());
        System.out.println("PeekFirstElemnt "+deck.peekFirst());
        System.out.println("PeekElemntLast "+deck.peekLast());
    }
}
