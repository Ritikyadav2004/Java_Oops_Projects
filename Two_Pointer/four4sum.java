package Two_Pointer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class four4sum {
    public static void main(String[] args) {
        int arr[] = {-3,-2,-1,0,1,2,3};//{1,0,-1,0,-2,2};
        
        int left=0;
        int right=arr.length-1;
        int fix1=0;
        int fix2=0;
        List<List<Integer>> list = new ArrayList<>();
     
        Arrays.sort(arr);
        for(int i=0;i<arr.length-3;i++)
        {  
             if(i>0 && arr[i]==arr[i-1])continue;// skip duplicate value
           
             fix1=i;
             for(int j=i+1;j<arr.length-2;j++)
             {  
                if(j>i+1 && arr[j]==arr[j-1])continue; // skip 
                fix2=j;
                left=j+1;
                right=arr.length-1;
                while(left<right)
                {
                    if(arr[fix1]+arr[fix2]+arr[left]+arr[right]==0)
                    {
                        list.add(List.of(arr[fix1],arr[fix2],arr[left],arr[right]));
                       
                        while (left<right && arr[left]==arr[left+1]) left++;
                        while(left<right && arr[right]==arr[right-1])right--;

                         left++;
                        right--;
                    }
                    else if(arr[fix1]+arr[fix2]+arr[left]+arr[right]<0)
                    {
                        left++;
                    }
                    else
                    right--;
                    
                }
             }

        }
        System.out.println(list);

    }
}
