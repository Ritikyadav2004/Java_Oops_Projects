package Two_Pointer;

import java.util.ArrayList;

public class twoSum {

    public static int [] sort(int [] arr)
    {
          for(int i=0;i<arr.length-1;i++)
          {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
          }
          return arr;
    }
    public static void main(String[] args) {
        int arr[] = {21,22,3,4,3,3,4,5,33,4,34};
       int target=55;
        ArrayList<Integer> list = new ArrayList<>();
        sort(arr);
        int left=0;
        int right=arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[left]+arr[right]==target)
            {
                list.add(left);
                list.add(right);
                break;
            }
            if(arr[left]+arr[right]>target)
            {
                right--;
            }
            else
            left++;
        }
        System.out.println("Array After Sorting");
        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println("\nIndexing in array");
        System.out.println(list);

        
    }
}
