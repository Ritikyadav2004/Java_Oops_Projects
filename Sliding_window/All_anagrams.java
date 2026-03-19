package Sliding_window;
import java.util.Arrays;
import java.util.Stack;

public class All_anagrams{
    public static void main(String[] args) {
        String str ="abacb";//"cbaebabacd";//"abcabdebca";// "abcabdebca";
        Stack<Integer> stack = new Stack<>();
        String str2 = "abc";
        int left = 0;
        int right = str2.length()-1;
        int count[]=new int[256];//to count in its specifiuc position
        int count2[] = new int[256];
        for(int i=0;i<str2.length();i++)
        {
            count2[str2.charAt(i)]++;
        }
        for(int i=0;i<str2.length()-1;i++)
        {
            count[str.charAt(i)]++;
        }//increse the count of first k-1 elemnt in count[] array then with the help of while loop we can increase one count and decrese previous count and also we intinalies the right wiht str2.length()1
        while(right<str.length())
        {
            count[str.charAt(right)]++;
            // while(count[str.charAt(right)]>1)
            // {
            //        count[str.charAt(left)]--;
            //        left++;
            // }
            if(Arrays.equals(count,count2))
            {
                stack.push(left); // it psuh all the anagram starting index
            }
            count[str.charAt(left)]--;
            left++;
            right++;
               
            }
            System.out.println(stack);
        }
    }
