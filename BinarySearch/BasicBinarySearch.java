package BinarySearch;

public class BasicBinarySearch {
    //SORTED BUT NOT MENTIONED INCREASING OR DECREASIN 
    private static int BinarySearchAesc(int[] a,int target)
    {
        int start=0;
        int end=a.length-1;
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


  /// ARRAY SORTED IN DESECNDING ORDER
    private static int BinarySearchDesc(int a[], int target)
    {
                          int start=0;
        int end=a.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(a[mid]==target)
            {
                return mid;
            }
            
            if(a[mid]<target)
            {
               end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] Aesc={1,2,3,4,5,6,7,8,9};
        int target=5;
        int [] Desc={9,8,7,6,5,4,3,2,1};

        // HERE WE KNOW AESCENDING ORDER DESCEDING ORDER
        if(BinarySearchDesc(Desc,target)==-1)
        {
            System.out.println("Elemnt Not found");
        }
            else

        System.out.println(" Binary Search Desc Element found at "+BinarySearchDesc(Aesc,target));



        if(BinarySearchAesc(Desc,target)==-1)
        {
            System.out.println("Elemnt Not found");
        }
            else

        System.out.println(" Binary Search Aesc Element found at "+BinarySearchAesc(Desc,target));
       



        // if we not know whether Sorted in which order so take
        int arr[] = {1,1,2,2,3,4,5,6,7,8,9,};

        if(arr[0]<arr[arr.length-1])
        {
            if(BinarySearchAesc(Aesc,target)==-1)
                System.out.println("Elemnt Not found");
        
            else
                System.out.println(" Binary Search Aesc Element found at "+BinarySearchAesc(arr,target));

        
        }

        else{
             if(BinarySearchDesc(Desc,target)==-1)
                System.out.println("Elemnt Not found");
        
            else
                System.out.println(" Binary Search Desc Element found at "+BinarySearchDesc(arr,target));

        }

    }
}
