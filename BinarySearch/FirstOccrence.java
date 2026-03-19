package BinarySearch;

public class FirstOccrence {
    public static void main(String[] args) {
         int nums[]={2,2,3,4,5,6,6,7,7,7,8,9,10};
        // KEY IDEA IS THTA WHENEVER WE GET FIRST TIME NUMBER STOR ITS INDEX IT MAY BE ANSWER 
        // AND AGAIN FIND IN LEFT SIDE 
            int start =0;
            int end=nums.length-1;
            int index=0;
            int target=7; // we have to find its first index
            while(start<=end)
            {
                int mid = start + (end-start)/2;
                if(nums[mid]==target)
                {
                    index=mid;
                    end=mid-1; // find in left side if found else indes is out answer
                }

                if(nums[mid]<target)
                {
                    start=mid+1;

                }
                else{
                    end=mid-1;
                }
            }
            System.out.println("First Occrence of "+target+" Is At Index :"+index);
    }
}
