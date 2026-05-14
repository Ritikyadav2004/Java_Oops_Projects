package Sliding_window;
import java.util.*;
public class RepeatedDnaSequences {
    

    public static List<String> findRepeatedDnaSequences(String s) {
        if (s == null || s.length() < 10) {
         return new ArrayList<>();
}
        Map<String,Integer> map= new HashMap<>();
        StringBuilder str= new StringBuilder();
        List<String> list= new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            str.append(s.charAt(i));
        }

        map.put(str.toString(),1);
        for(int i=1;i<s.length()-10+1;i++)
        {
            // remove elemnt at s 
            str.deleteCharAt(0);

            // append new Character
            str.append(s.charAt(i+10-1));

            if(!map.containsKey(str.toString()))
            {
                map.put(str.toString(),1);
            }
            else
            {
                int val=map.get(str.toString());
                map.put(str.toString(),val+1);
            }
        }

        for(Map.Entry<String,Integer> entry:map.entrySet() )
        {
            if(entry.getValue()>1)
            {
                list.add(entry.getKey());
            }
        }

        return list;
    }
    public static void main(String[] args) {
        String st="AAAAACCCCCAAAAACCCCCCAAAAAGGGTTT";
        System.out.println(findRepeatedDnaSequences(st));
    }
}


