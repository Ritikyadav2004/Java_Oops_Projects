package Sliding_window;
// https://www.geeksforgeeks.org/problems/chocolate-distribution-problem3825/1
import java.util.*;
public class chocolateProblem {
    

    public static int findMinDiff(int arr[], int m) {
        // code here
        Arrays.sort(arr);
        List<Integer>list= new ArrayList<>();
         
        int minDiff=0;
        
        for(int i=0;i<m;i++)
        {
            list.add(arr[i]);
        }
        // add top m elemnt in ascending order
        
        minDiff=list.get(list.size()-1)-list.get(0);
        
        for(int i=1;i<arr.length-m+1;i++)
        {
            // remove previos elemnt from list
            list.remove(0);
            // add Next Elemnt init 
            list.add(arr[i+m-1]);
            int ele=list.get(list.size()-1)-list.get(0);
            minDiff=Math.min(minDiff,ele);
            
        }
        
        return minDiff;
    }
    // Revising This Problem 


    public static void main(String[] args) {
        int ar[]={3, 4, 1, 9, 56, 7, 9, 12};
        int m=5;
        int ans=findMinDiff(ar,m);
        System.out.println(ans);
    }
}