package JavaCollections;
import java.util.Stack;

public class StackDataStructure {

    public static void main(String[] args) {
        //in this it maintedn the ibsertion order
    // so not as much good comparing to c
    //7 ayaa to print method se pahale 7 print hoga 
    Stack<Integer> stack = new Stack<>();
    stack.push(8);
    stack.push(9);
    stack.push(17);
    System.out.println(stack);
    System.out.println();
    for(int i:stack)
    {
        System.out.print(i+" ");
    }

      System.out.println("\n"+stack.peek());
      System.out.println("Item Popped "+stack.pop());
    }
}
