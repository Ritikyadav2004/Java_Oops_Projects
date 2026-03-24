public class BubbleSort {
    public static void main(String[] args) {
        // int arr[] = {12,22,33,22,87,3,344,3,23,34,3,33,33,4,3,34,5,5,4,4,4};
        int arr[]={1,2,3,4,5,6};
        int n=arr.length;
        for(int i=n-1;i>=0;i--)
        {

            boolean didSwap=false;
            for(int j=0;j<=i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp; 
                    didSwap=true;
                }
                
            }
            if(!didSwap)
                {
                    break;
                }
                System.out.print("Runs"+" "+i);
        }
        System.out.println();
        for (int i : arr) {
            System.out.print(i+" ");
        }

        }
}
    

