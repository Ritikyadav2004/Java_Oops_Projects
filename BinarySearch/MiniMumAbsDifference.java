package BinarySearch;

public class MiniMumAbsDifference {

    public static void MinimumDiff(int arr[],int target)
    {   
         if (arr.length==0) return;
        int start=0;
        int end=arr.length-1;
        // int res=-1;
        int res=0;
        
        int ans=-1;
        while(start<=end)
        {
            int  mid =start+ (end-start)/2;
            if(arr[mid]==target)
            {
                ans=mid;
                break;
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
            }

            else
            {
                end=mid-1;// arr[mid]>target vala case
            }
        }

        // case one if we find ceil at end
        if(ans==-1)
        {
           if(end==-1)
           {
            res=Math.abs(target-arr[start]); // floor nho he to ceil hee sahi
           }
           else if (start==arr.length){
            // pakka start  start=mid+1 krte krte length exceed kr de
            // then ceil floor present rahega 
            res=Math.abs(target-arr[end]);
           }

           else{
            // if ceil and flooor dono exist kre ho to then 
            int ans1=Math.abs(target-arr[start]);
            int ans2= Math.abs(target-arr[end]);
            res= (ans1<ans2)?ans1:ans2;

        }
        }
        
        System.out.println("Minimum Possible Difference is :"+res);
    }
    public static void main(String[] args) {
        int arr[]={2,4,8,13,17,19}; // array shd be sorted
        int target=12;
        int target1=13;
        MinimumDiff(arr, target);
        MinimumDiff(arr, target1);
    }
}
