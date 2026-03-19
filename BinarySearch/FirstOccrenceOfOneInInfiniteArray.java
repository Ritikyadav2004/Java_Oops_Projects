package BinarySearch;

public class FirstOccrenceOfOneInInfiniteArray {

    public static int []findRangeInInfiniteArray(int arr[],int target)
    {
         int start=0;
         int end=1;
         while(arr[end]<target)
         {
            start=end;
            end=2*end;
         }
         int range[]=new int[2];
         range[0]=start;
         range[1]=end;
         return range;

    }
    public static int findFirstOccrence(int arr[],int target,int start,int end)
     {
        int ans=-1;
        while(start<=end)
        {
            int mid= start + (end-start)/2;
            if(arr[mid]==target)
            {
             ans=mid;
             end=mid-1;// find in left side for the first occrence
            }
            else if(arr[mid]<target)
            {
                start=mid+1;

            }
            else
            {
                end=mid-1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]={0,0,0,0,0,0,0,0,0,1,1,1,1,1,1,1,1,};
        // put same target in both find rnge and in search elemnt
        int range[]=findRangeInInfiniteArray(arr, 1);
        int result=findFirstOccrence(arr, 1, range[0], range[1]);
        if(result==-1)
        {
            System.out.println("Element Not Found");

        }
        else{
            System.out.println("Element Found At :"+result);
        }
    }
}
