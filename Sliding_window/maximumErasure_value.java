package Sliding_window;
//ps we have given a array of integer we have to find a subarray  containing unique elemnts the score we get is the sum of that elemnt
//num=[4,2,4,5,6] output=17//
public class maximumErasure_value {
    public static void main(String[] args) {
        int nums[] = {5,2,1,2,5,2,1,2,5};//{4,2,4,5,6};
        int count[] = new int[10001];//to count the element in the specific position
        int left=0;
        int right =0;
        int maxsum=0;
        while(right<nums.length)
        {
            count[nums[right]]++;
            while(count[nums[right]]>1)
            {
                count[nums[left]]--;
                maxsum-=nums[left];
                left++;
            }
           maxsum+=nums[right];
           right++;




        }
        System.out.println(maxsum);

    }
}
