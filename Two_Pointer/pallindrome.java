package Two_Pointer;

public class pallindrome {
    public static boolean check(String str)
    {
       int left=0;
       int right=str.length()-1;
       while(left<right)
       {
        // we dont nee d to skip any value so just check from last and first 
        if(str.charAt(left)!=str.charAt(right))
        {
            return false;
        }
        left++;
        right--;

       }
       return true;

    }
    public static void main(String[] args) {
        String str = "abckcba";
        int left=0;
        int right = str.length()-1;
        boolean flag=false;
        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(left)!=str.charAt(right))
            {   flag=true;
                System.out.println("String is not Pallindrome");
                return;
            }
            left++;
            right--;
        }
        if(flag!=true)System.out.println("String is pallindorme");
        System.out.println(check(str));
    }
}
