package Sliding_window;
// concept of variable size window
public class longestSubarrayWithSumlessThenTarget
{
 public static void main(String[] args) {
    int arr[] = {1,2,3,2,4,5,6,5,6};
    int target = 17;
    int  left = 0;
    int right =0;
    int maxlength=0;
    int sum=0;
    while(right<arr.length)
    {
        sum+=arr[right];
        while(sum>target)
        {
            sum-=arr[left];
            left++;
        }
        maxlength=Math.max(maxlength, right-left+1);
        right++;
    }
    System.out.println(maxlength);
 }
}