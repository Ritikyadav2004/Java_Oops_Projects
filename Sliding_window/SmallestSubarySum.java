package Sliding_window;
public class SmallestSubarySum {
  
    public static int smallestSubWithSum(int x, int[] arr) {
        // Your code goes here
        int ws=0;
        int we=0;
        int n=arr.length;
        int sum=0;
        int minLength=Integer.MAX_VALUE;
        while(we<n)
        {
            sum+=arr[we];
            if(sum>x)
            {
                int minlen=we-ws+1;
            minLength=Math.min(minLength,minlen);
            }
             
             //shrinking the window 
            while(ws<we && sum>x)
            {
                 sum-=arr[ws];
                 ws++;
                  if(sum>x)
                  {
                       int minlen=we-ws+1;
                   minLength=Math.min(minLength,minlen);
                  }
                 
            }
            
            
            we++;
        }
        
        return (minLength==Integer.MAX_VALUE)?0:minLength;
    }
public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6,7,8,9};
    int sum=5;
    System.out.println(smallestSubWithSum(sum, arr));
}
}

