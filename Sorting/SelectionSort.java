public class SelectionSort
{
    public static void main(String[] args) {
        int arr[]={12,23,43,45,65,67,87,788};
        int n=arr.length;
        for(int i=0;i<=n-2;i++)
        {
             int minIndex=i;
             for(int j=i;j<=n-1;j++)
             {
                if(arr[j]<arr[minIndex])
                {
                   minIndex=j;
                }

             }
             int temp=arr[i];
             arr[i]=arr[minIndex];
             arr[minIndex]=temp;

        } 
        // sorted array time complexity n^2

        for(int i:arr)
        {
            System.out.print(i+" ");
        }
    }
}