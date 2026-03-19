package Sliding_window;

public class longest_substring {
    // so we have to find a window of maximum length who does not have repeating vharacter
   public static void main(String[] args) {
    String str = "abcabcabc";
     int count[] = new int[256];
     int left=0;
     int right = 0;
     int maxlen=0;
     while(right<str.length())
     {
        count[str.charAt(right)]++;
        while (count[str.charAt(right)]>1) {
            //shrink window move left 
             count[str.charAt(left)]--;
             left++;
        }
        maxlen=Math.max(right-left+1, maxlen);
        right++; // increment right to avoid infinite loop and out of bounds
    }
    System.out.println(maxlen);
   }
  
}
