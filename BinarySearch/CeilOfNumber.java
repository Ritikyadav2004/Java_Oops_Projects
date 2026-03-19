package BinarySearch;

public class CeilOfNumber {
    public static void main(String[] args) {
        
         int [] arr ={2,3,4,5,6,7,7,11,16};
        //ceil IS THE GREATES VALUE <= TARGET
        // SEARCH IN LEFT SIDE WHENE ELEMNT FOUND 
        int start=0;
        int end=arr.length-1;
        int target=8;
        int ceil=0;
    while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]==target)
            {
                System.out.println(mid);
                break;
            }
            
            else if(arr[mid]<target)
            {
               start=mid+1;
               // this is our left side case
               
            }
            else{  // target>arr[mid]
                end=mid-1;
                ceil=arr[mid]; // jahir se baatr he next elemnt ya to vo khud target hoga ya usse choota 

            }
        }
        System.out.println(ceil);
    }
    }

