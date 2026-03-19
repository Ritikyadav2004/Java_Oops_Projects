package BinarySearch;

public class FloorOfNumber {
    public static void main(String[] args) {
        int [] arr ={2,3,4,5,6,7,7,11,16};
        //FLOOR IS THE GREATES VALUE <= TARGET
        // SEARCH IN LEFT SIDE WHENE ELEMNT FOUND 
        int start=0;
        int end=arr.length-1;
        int target=8;
        int floor=0;
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
               floor=arr[mid]; // jahir se baatr he next elemnt ya to vo khud target hoga ya usse choota 

            }
            else{
                end=mid-1;
            }
        }
        System.out.println(floor);
    }
}
