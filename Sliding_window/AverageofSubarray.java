package Sliding_window;
public class AverageofSubarray {
    public static void main(String[] args) {
        int arr[] ={12,3,2,1,2,3,4,4};
        int k=3;//fixed size window
        int left =0; 
        int j=1;
        int right = k-1;
        int sum=0;
        for(int i=0;i<k-1;i++)
        {
            sum+=arr[i];
        }
        while(right<arr.length)
        {
            sum+=arr[right];
            System.out.println("Average of "+j+" Subarray is :"+sum/(float)k);
            j++;
            sum-=arr[left];//removi9ng the addition of 1st elemnt 
            left++;// sliding our window
            right++;
        }
    }
}
