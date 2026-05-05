package Stack;
import java.util.*;
public class MinStack {
    


     
     private List<int[]> st;
    public MinStack() {
        st= new ArrayList<>();
    }
    
    public void push(int val) {
        if(st.isEmpty())
        {
            st.add(new int[]{val,val});
        }
        else
        {   

           // currminimu
           int currMin = st.get(st.size()-1)[1];
           // add new minimum
           st.add(new int[]{val,Math.min(val,currMin)});

        }
    }
    
    public void pop() {
        if(!st.isEmpty())
        {
            st.remove(st.size()-1);
        }
    }
    
    public int top() {
        return st.get(st.size()-1)[0];
    }
    
    public int getMin() {
        return st.get(st.size()-1)[1];
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
