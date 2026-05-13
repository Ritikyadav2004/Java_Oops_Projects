package Sliding_window;

import java.util.*;


// https://www.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1
public class firstNegativeNumber
{
    public static List<Integer> firstNegative(int arr[],int k)
    {  List<Integer> list= new ArrayList<>();
      Queue<Integer> queue= new LinkedList<>();
      int res[]=new int[arr.length-k+1];
      int n=arr.length;
      for(int i=0;i<k;i++)
      {
        if(arr[i]<0)
        {
            queue.offer(arr[i]);
        }
      }

      res[0]=(queue.isEmpty()?0:queue.poll());

     for(int i=1;i<n-k+1;i++)
      {
        // remove the element if it is negative
        if(arr[i-1]<0)
        {
         queue.poll();  
        }

        if(arr[i+k-1]<0)
        {
            //upcommig value is negative then add 
            queue.offer(arr[i+k-1]);

        }

         res[i]=(queue.isEmpty()?0:queue.peek());
      }
      for(int i:res)
      {
        list.add(i);
      }

        return list;
    }
   public static void main(String[] args) {
      int arr[]={12, -1, -7, 8, -15, 30, 16, 28};
      int k=3;
        for(int i:firstNegative(arr, k))
        {
            System.out.print(i+" ,");
        }
      

   }
}