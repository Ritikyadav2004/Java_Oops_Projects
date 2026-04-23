package Recurssion;
public class HeightOfBinaryTree
{
    public class node{
        int data;
        node left;
        node right;
        node(){};
        node(int val)
        {
            this.data=val;
        }
        node (int val,node left,node right)
        {
            this.data=val;
            this.left=left;
            this.right=right;
        }
    }

    public static void main(String[] args) {
        node root=new node(10);

    }
}