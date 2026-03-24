public class InsertionSort {
    public static void main(String[] args) {
        // int arr[]={9,8,7,6,5,4,3,2,1};  // worst case
        int arr[]={1,2,3,4,5,6,7,8,9}; //best case
        for(int i=0;i<arr.length;i++)
        {
            int j=i;
            while(j>0 && arr[j]<arr[j-1])
            {
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
                System.out.print("Runs");
            }

            


        }
        System.out.println();
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
