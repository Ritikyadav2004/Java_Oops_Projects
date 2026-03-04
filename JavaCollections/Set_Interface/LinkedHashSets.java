package JavaCollections.Set_Interface;
// package JavaCollections.Set_Interface;
import java.util.*;
public class LinkedHashSets {

// It is used to cheque whether the element exist in the data structure or not With the method of contains

    public static void main(String[] args) {
         Set<Integer>  set= new LinkedHashSet<>();
         set.add(1);
         set.add(1);
         set.add(2);
         set.add(3);
         set.add(4);
         set.add(5);
         System.err.println(set);
         for(Integer i:set)
         {
            System.out.print(i+" ");
         }

         //ELEMNT WERE REMOVED THROUG THERI VALUES NOT WIHT THERI INDEXES
        set.remove(5);
        System.out.println("\n"+set);

        System.out.println(set.contains(7));
        System.err.println(set.contains(1));

         
    }
}
// Numbers will be converted into Code Order not mattered here in certain Remove methods are not just stored unique value in case of
// At property are We use as said Numbers will be unique but insertion and remove order will be not Maintained
// It always follow insertion order if I insert 2 then it will be first Next will be other agreement



// COMPLEXITY OR