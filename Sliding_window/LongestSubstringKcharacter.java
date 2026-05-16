package Sliding_window;
public class LongestSubstringKcharacter {
    

// https://www.geeksforgeeks.org/problems/longest-k-unique-characters-substring0853/1   class Solution {
    public static int longestKSubstr(String s, int k) {
        // code here
        int windowStart=0;
        int windowEnd=0;
        int uniqChar=0;
        int maxLen=Integer.MIN_VALUE;
        int freqCount[]=new int[26];
        int n=s.length();
        while(windowEnd<n)
        {
            int index=s.charAt(windowEnd)-97;
            if(freqCount[index]==0)
            {
                uniqChar++;
                freqCount[index]++;
                
            }
            else
            {
                freqCount[index]++;
            }
            if(uniqChar==k)
            {
                int length=windowEnd-windowStart+1;
                maxLen=Math.max(maxLen,length);
            }
            else if  (uniqChar>k)
            {
                // shrinking face 
                while(windowStart<windowEnd && uniqChar>k)
                {    index=s.charAt(windowStart)-97;            
                    freqCount[index]--;
                    windowStart++;
                    if(freqCount[index]==0)
                    {
                        uniqChar--;
                    }
                }
            }
            windowEnd++;
        }
        
        
        return (maxLen==Integer.MIN_VALUE)?-1:maxLen;
        
    }

    public static void main(String[] args) {
        System.out.println(longestKSubstr("aabacbebebe", 3));
    }
}