package Two_Pointer;

//import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum_3{
    public static void main(String[] args) {
        int arr[] = {-4,-1,-1,0,1,2};
        //we have to use two pointer in other two number keeping one number fixed
        int left=1;
        int fix=0;
        int right=arr.length-1;
        Arrays.sort(arr); // Sort the array
        List<List<Integer>> list =  new ArrayList<>();
        for(int i=0;i<arr.length-2;i++)
        {   if(i>0 && arr[i]==arr[i-1])continue; // to avoid duplicate triplet
            fix=0+i;//fixed number
            left=1+i;//left pointer
            right=arr.length-1;//
            while(left<right)
            {
                if(arr[fix]+arr[left]+arr[right]==0)
                {
                    list.add(List.of(arr[fix],arr[left],arr[right]));
                    left++;
                    right--;
                    while(left<right&& arr[left]==arr[left+1]) 
                    {left++;}
                    while(left<right && arr[right]==arr[right-1])
                    {right--;}

                   
                }
                else if(arr[fix]+arr[left]+arr[right]<0)
                {
                    left++;
                    
                }
                else
                    {
                        right--;
                    }
            
            }
    }
    
    System.out.println(list);
}
}