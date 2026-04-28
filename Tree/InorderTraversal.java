//https://leetcode.com/problems/binary-tree-inorder-traversal/
package Tree;
import java.util.*;
public class InorderTraversal {
    

 //    Definition for a binary tree node.
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
 
//REVISING THE CONCEPT
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res= new ArrayList<>();
        Stack<TreeNode> stack= new Stack<>();
        TreeNode node=root;
        while(node!=null || !stack.isEmpty())
        {
            // move to left 
            while(node!=null)
            {
                stack.push(node);
                node=node.left;
            }
            // till then we process left now  its left null then print its root which is present at top of stack
            node =stack.pop();
            // mow add this into array
            res.add(node.val);
            //after it moved to right
            node=node.right;
        }
        return res;
    }
}