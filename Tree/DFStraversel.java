package Tree;

public class DFStraversel {
    class TreeNode<E>

    {
            E data;
            TreeNode<E>left;
            TreeNode<E> right;
            public TreeNode(E data)
            {
                this.data=data;
                left=null;
                right=null;
            }
    }
    public void Preordertraversel(TreeNode<Integer> root)
    {
        if(root==null) return;
        System.out.println(root.data);
        Preordertraversel(root.left);
        Preordertraversel(root.right);
    }

    public void Postordertraversel(TreeNode<Integer> root)
    {
        if(root==null) return;
        
        Postordertraversel(root.left);
        Postordertraversel(root.right);
        System.out.println(root.data);
    }

     public void Inordertraversel(TreeNode<Integer> root)
    {
        if(root==null) return;
        
        Inordertraversel(root.left);
        System.out.println(root.data);
        Inordertraversel(root.right);
        
    }
}