package Tree;
import java.util.*;
// import javax.swing.tree.TreeNode;

public class BFStraversel {
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
                 
    public static void main(String[] args) {
        
    }

    public ArrayList<Integer> BFS(TreeNode<Integer> root)
    {
        ArrayList<Integer> res= new ArrayList<>();
        Queue<TreeNode<Integer>> queue= new LinkedList<>();
        queue.offer(root);
            while(!queue.isEmpty())
            {
                TreeNode<Integer> node=queue.poll();
                res.add(node.data);
                if(node.left!=null)
                {
                        queue.offer(node.left);
                }
                if(node.right!=null)
                {
                  queue.offer(node.right);
                }                                   
            }
        
     return res;
    }
}
