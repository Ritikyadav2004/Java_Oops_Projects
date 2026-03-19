package Sliding_window;
//conecpt of variabvle sliding window
public class minimumSizeSubarray {
    public static void main(String[] args) {
        int arr[] ={2,1,1,2,4,1};
        int target = 7;
        int left=0;
        int sum=0;
        int minsum = Integer.MAX_VALUE;
        int right=0;
        while(right<arr.length)
        {
           sum+=arr[right];
           while(sum>=target)
           {
                minsum = Math.min(minsum , right-left+1);
                sum-=arr[left];
                left++;
           }
           right++;
        }
        System.out.println(minsum == Integer.MAX_VALUE ? 0 : minsum);
    }
}
