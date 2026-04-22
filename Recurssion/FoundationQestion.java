package Recurssion;
public class FoundationQestion {


    //code for printing 1 to n
    public static void printOneToN(int n)
    {
        if(n==1)
        {
            System.out.print(n+" ");
            return;
        }
        printOneToN(n-1);
        System.out.print(n+" ");
    }


    public static void printNtoOne(int n)
    {
        if(n==1)
        {
            System.out.println(n+" ");
            return;
        }
        System.out.print(n+" ");
        printNtoOne(n-1);
    }


    public static int fiboacci(int n)
    {
        if(n-2==0 || n-1==0)
        {
            // System.out.print(n+"");
            return n;
        }
         
        return fiboacci(n-2)+fiboacci(n-1);


    }

    public static int  fiboacciUsingLoop(int n)
    {
        int a=0;
        int b=1;
        int c=0;
        for(int i=0;i<n;i++)
        {
          c=a+b;
          a=b;
          b=c;
        }
        return c;
    }


    public static int factorial(int n)
    {
        if(n==1|| n==0)
        {
              return n;
        }

        return n*factorial(n-1);

    }
    public static void main(String[] args) {
        
        printOneToN(10);
        System.out.println();
        printNtoOne(10);
        System.out.println(fiboacci(15));
        System.out.println(fiboacciUsingLoop(15));
        System.out.println(factorial(5));
    }
}
