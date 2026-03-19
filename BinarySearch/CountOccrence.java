package BinarySearch;

public class CountOccrence {
    public static int firstOccur(int arr[],int target)
    {
        int start=0;
        int end=arr.length-1;
        int index=0;
        while(start<=end)
        {
            int mid=start+ (end-start)/2;
            if(arr[mid]==target)
            {   
                index=mid;
                end=mid-1;
                // System.out.println("hehe");
            }
            else if(arr[mid]<target)
            {
                start=mid+1;
                //  System.out.println("hehe");
            }
            else
            {
                start=mid-1;
                //  System.out.println("hehe");
            }
        }
        return index;
    }

    public static int lastOccrence(int arr[],int target)
    {
                int start=0;
                int end=arr.length-1;
                int index=0;
                while(start<=end)
                {
                    int mid=start+(end-start)/2;
                    if(arr[mid]==target)
                    {
                         index=mid;
                         start=mid+1;// search in right side
                          System.out.println("kehe");
                    }
                    else if(arr[mid]<target)
            {
                start=mid+1; System.out.println("kehe");
            }
            else
            {
                start=mid-1; System.out.println("kehe");
            }
                }
                return index;
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,2,2,4,5,6,7,8,9};
        int last=lastOccrence(arr, 2);
        int first=firstOccur(arr, 2);
        System.out.println(last-first+1);


    }
}
