package Tree;

public class BalancedBinaryTree {
    


//  Definition for a binary tree node.
 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }
 }


    public boolean isBalanced(TreeNode root) {
    int height=getHeight(root);
     return(height!=-1);

    
    }

     public int getHeight(TreeNode root)
     {
        if(root==null) return 0;
        // apply post order trvaersel
        int leftSubtree=getHeight(root.left);
        int rightSubtree=getHeight(root.right);
        if(leftSubtree==-1 || rightSubtree==-1)
        {
            return -1;
        }
        if(Math.abs(rightSubtree-leftSubtree)>1) return -1;

        return 1+Math.max(leftSubtree,rightSubtree);
        
     }
}