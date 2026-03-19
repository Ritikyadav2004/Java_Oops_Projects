package BinarySearch;

public class SortedInfiniteArray {
    public static int[] findRangeInInfiniteArray(int arr[],int target)
    {
      int result[]= new int[2];
      int start=0;
      int end=1;
      while(arr[end]<target)
      {
        start=end;
        end=2*end;
      }
      result[0]=start;
      result[1]=end;
      return result;


    }
    private static int BinarySearchAesc(int[] a,int target , int start,int end)
    {
        
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(a[mid]==target)
            {
                return mid;
            }
            
            if(a[mid]<target)
            {
               start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return -1;
    
    }
    public static void main(String[] args) {
        // considering infitne array
        int[] arr={1,2,3,4,5,6,7,8,9,10,11,22,33,44,55,66,77};
        int range[]=findRangeInInfiniteArray(arr, 10);
        int ans=BinarySearchAesc(arr, 10, range[0],range[1]);
        if(ans==-1)
        {
            System.out.println("Element Not Found");

        }
        else{
            System.out.println("Element Found At :"+ans);
        }
        
    }
}
