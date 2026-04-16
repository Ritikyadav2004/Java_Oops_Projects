package Tree;
import java.util.*;
public class MaxDepth {
    


//  Definition for a binary tree node.
 public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode() {}
     TreeNode(int val) { this.val = val; }
     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;        this.right = right;
     }
 }
 

    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        
        Queue<TreeNode> queue= new LinkedList<>();
        int size=0;
        int level=0;
        queue.offer(root);
        while(!queue.isEmpty())
        {    
            size=queue.size();
            while(size>0)
            {   
                size--;
                TreeNode node = new TreeNode();
                node=queue.poll();
                if(node.left!=null)
                {
                    queue.offer(node.left);
                }
                if(node.right!=null)
                {
                    queue.offer(node.right);
                }
            }
            if(!queue.isEmpty())
            level++;
        }

        return (level+1);
    }
}