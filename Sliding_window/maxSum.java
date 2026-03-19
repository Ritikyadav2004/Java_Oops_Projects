package Sliding_window;
public class maxSum {
    public static void main(String[] args)
    {
        int arr[] = {4,2,4,5,6};
        int left = 0;
        int right = 0;
        int currentSum=0;
        int maxsum=0;
        int count[]= new int[100];

        while(right<arr.length)
        { 
            int number = arr[right];
            count[number]++;// calcaulating the count of that number in my count array
            currentSum+=arr[right];
           while(count[number]>1)//shrink if valu repeated
           {
            count[arr[left]]--;
            currentSum-=arr[left];
            left++;
           }
           maxsum = Math.max(maxsum, currentSum);
           right++;
        }
        System.out.println(maxsum);
    }
}
