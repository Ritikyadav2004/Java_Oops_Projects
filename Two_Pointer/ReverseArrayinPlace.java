package Two_Pointer;

public class ReverseArrayinPlace {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int left=0;
        int right=arr.length-1;
        for(int i=0;i<arr.length/2;i++)
        {
         int temp= arr[right];
         arr[right]=arr[left];
         arr[left]=temp;
         left++;
         right--;

        } 
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
