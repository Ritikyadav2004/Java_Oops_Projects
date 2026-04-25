package Recurrsion;

import java.util.ArrayList;

public class SortArrayUsingRecurrsion {
    public static void insert(ArrayList<Integer>arr,int temp)
    {
        if(arr.size()==0|| arr.get(arr.size()-1)<=temp)
        {
            arr.add(temp);
            return;
        }

        int val=arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        insert(arr,temp);
        arr.add(val);

        return;
    }
    public static void sort(ArrayList<Integer>arr)
    {
        if(arr.size()==1) return;
         
        int val=arr.get(arr.size()-1);
        arr.remove(arr.size()-1);
        sort(arr);
        insert(arr,val);

    }
    public static void main(String[] args) {
        ArrayList<Integer> arr= new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(5);
        arr.add(0);
        arr.add(3);
        System.out.println(arr);

        sort(arr);
        System.out.println(arr);
    }
}
