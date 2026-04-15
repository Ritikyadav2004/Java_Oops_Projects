package Stack;
public class MyStack
{
    int stack[];
    int top;
    int size;
    public MyStack(int stackSize)
    {
        stack = new int[stackSize];
        top=-1;
        size=stackSize;
    }
    public void push(int data)
    {
        if(top>=size-1)
            System.out.println("\nStack Overflow");
        else{
            top++;
            stack[top]=data;
        }
    }

    public boolean isEmpty()
    {   
        return size<=-1;
    }

    public int size()
    {
        return top+1;
    }


    public int peek()
    {
       if(isEmpty())
       {
        return Integer.MIN_VALUE;
       }

       return stack[top];
    }
    public int pop()
    {
        int val=peek();
        if(val!=Integer.MIN_VALUE)
        {   
            top--;

        }
        return val;
    }

    public void printStack()
    {
        for(int i=0;i<=top;i++)
        {
          System.out.print(stack[i]);
          if(i!=top)
          {
                   System.out.print(",");
          }
        }
    }
    public static void main(String[] args) {
        int n=6;
        MyStack stack = new MyStack(n);
        System.out.println(stack.isEmpty());
        stack.push(10);
        stack.push(20);
        // stack.printStack();
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.printStack();
        stack.push(60);
        stack.push(70);

        System.out.println(stack.pop());
        System.out.println(stack.peek());
        stack.printStack();


    }
}