package JavaCollections.Map;
import java.util.*;
// In this the difference is that it maintains a sorted order either in increasing order or either in decreasing order like a tree and its complexity is around over the log N

// it uses red and black tree and self balancing tree
public class TreeMaps {
        public static void main(String[] args) {
        // Map<Integer,String> map=new TreeMap<>();  // by defualt in increainf orderr
        // Map<Integer,String>map=new TreeMap<>((a,b)->(b-a));
        Map<Integer,String>map=new TreeMap<>(Collections.reverseOrder());
       
        map.put(2, "Narendera");
        map.put(3, "valamdir");
        map.put(4, "shee");
         map.put(1, "Ritik");
        System.out.println(map);
        
        for(Map.Entry<Integer,String> entry: map.entrySet())
        {
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }


        System.out.println("Printing using keyy");
        for(Integer key :map.keySet())
        {
          System.out.println(key+" --> "+map.get(key));
        }


        System.out.println("\nPrint USing Values");
       //WE CANT PRINT KEY USING VALUE
        for(String name:map.values())
        {
            System.out.println(name);
        }



        // TO FIND WHETHE KEY EXIT OR NOT 
        System.out.println(map.containsKey(3));   // if prsent true  speed jyada he 


        System.out.println(map.containsValue("Ritik"));   // low speed as linear search


        //to ypdate the key value 
        String Fullname= map.get(1)+" Yadav";
        map.put(1,Fullname);
        for(Integer key:map.keySet())
        {
            System.out.println(key+" -> "+map.get(key));
        }



        // if key prsen nhi hui to another method we will use that is  
        String defaultName=map.getOrDefault(90, "Narendera") +" Modi";
        map.put(2, defaultName);
        System.out.println();
        System.out.println();
        for(Integer key:map.keySet())
        {
            System.out.println(key+" -> "+map.get(key));
        }
    }
}
