package Stack;
import java.util.*;
public class ValidParenthesis {
    

    public boolean isValid(String s) {
        Stack<Character> stack  = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!stack.isEmpty())
            {
                char last=stack.peek();
                if(isPair(last,ch))
                {
                    stack.pop();
                    continue;
                }
            }

            stack.push(ch);            
        }
       return stack.isEmpty();
    }

    private boolean isPair(char last , char ch)
    {
        return (last=='{' && ch=='}') ||
                (last=='(' && ch==')')||
                (last=='[' && ch==']');
    }

   
}