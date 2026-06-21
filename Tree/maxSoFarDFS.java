package Tree;

public class maxSoFarDFS {
    



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
 
    // int max=Integer.MIN_VALUE;
    int count=0;
    public void preOrderT(TreeNode root , int maxSoFar)
    {
        if(root==null)
        return;

      
        if(root.val>=maxSoFar)
        {
            maxSoFar=root.val;
            count++;
        }
        preOrderT(root.left,maxSoFar);
        preOrderT(root.right,maxSoFar);


    }
    public int goodNodes(TreeNode root) {
        preOrderT(root,root.val);
        return count;

    }
}