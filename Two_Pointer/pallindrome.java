package Two_Pointer;

public class pallindrome {
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
    }
}
