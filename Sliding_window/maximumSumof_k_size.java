package Sliding_window;

import java.util.Scanner;

public class maximumSumof_k_size {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size:");
        int k = sc.nextInt();
        int arr[]  = {5,4,3,2,9,83};
        int left=0;
        int right =k-1;
        int currentSum=0;
        int maxsum=0;
        for(int i=0;i<k-1;i++)
        {
            currentSum+=arr[i];
        }
        while (right<arr.length) {
            currentSum+=arr[right];
            maxsum = Math.max(maxsum, currentSum);
            currentSum-=arr[left];// removung last elemnt 
            left++;//moving window further
            right++;
           
        }
        System.out.println(maxsum);
        sc.close();
    }
}
