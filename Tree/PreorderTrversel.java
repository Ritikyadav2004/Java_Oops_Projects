package Tree;
import java.util.*;
public class PreorderTrversel
{




//   Definition for a binary tree node.
   class TreeNode {
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

    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> arr = new ArrayList<>();
        if(root==null) return arr;

        Stack<TreeNode> stack= new Stack<>();
        stack.push(root);
        while(!stack.isEmpty())
        {
            TreeNode node=stack.pop();
            arr.add(node.val);

            if(node.right!=null)
            {
                stack.push(node.right);
            }

            if(node.left!=null)
            {
                stack.push(node.left);
            }
        }

        return arr;

    }
}