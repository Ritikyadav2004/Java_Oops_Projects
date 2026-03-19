package Sliding_window;
import java.util.Arrays;

public class permutation {
   
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;
        int left=0;
        int right=s1.length();
        int count1[]=new int[256];
        int count2[]=new int[256];
        for(int i=0;i<s1.length();i++)
        {
            count1[s1.charAt(i)]++;
            count2[s2.charAt(i)]++;
        }
        

        while(right<s2.length())
        {  
            if(Arrays.equals(count1,count2))
           return true;
           count2[s2.charAt(right)]++;
          
           count2[s2.charAt(left)]--;
           left++;
           right++;

        }
        return Arrays.equals(count1, count2);
    }
    public static void main(String[] args) {
        String s1="adc";
        String s2="dcda";
        permutation obj = new permutation();
        System.out.println(obj.checkInclusion(s1, s2));
    }
}

