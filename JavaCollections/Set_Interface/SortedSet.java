package JavaCollections.Set_Interface;

import java.util.*;

public class SortedSet {
    public static void main(String[] args) {
        Set<Integer> set= new TreeSet<>();
         set.add(1);
         set.add(1);
         set.add(5);
         set.add(2);
         set.add(3);
         set.add(4);
         set.add(72);
         set.add(0);
         System.out.println(set);



         // for printng it in decreaing oder what we hav to do pass lamda function


         // alternative Collections.reverseOrder()
         Set<Integer> maxset=new TreeSet<>((Integer a,Integer b)->(b-a));
         maxset.add(1);
         maxset.add(1);
         maxset.add(5);
         maxset.add(2);
         maxset.add(3);
         maxset.add(4);
         maxset.add(72);
         maxset.add(0);

         System.out.println("Max Set After Passing lamdda function");
         System.out.println(maxset);



         System.out.println(maxset.contains(7));
         System.out.println(set.contains(3939));






    }
}
// In this sorted order is maintained either increasing or decreasing
//TREE SET 


// COMPLEXITY O(LOGN)