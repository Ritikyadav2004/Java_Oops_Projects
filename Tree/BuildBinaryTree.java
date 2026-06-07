package Tree;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
public class BuildBinaryTree {
    

//   Definition for a binary tree node.
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
 

    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer,TreeNode>map= new HashMap<>();
        Set<Integer> children= new HashSet<>();

        // starting itrations
        for(int[] d: descriptions)
        {

            int parent=d[0];
            int child=d[1];
            int isLeft=d[2];

            map.putIfAbsent(parent,new TreeNode(parent));
            map.putIfAbsent(child,new TreeNode(child));
            
            // other wise give refrence
            TreeNode parentNode=map.get(parent);
            TreeNode childNode=map.get(child);

           
            // check cur left is 1 or not
            if(isLeft==1)
            {
                parentNode.left=childNode;
            }
            else{
                parentNode.right=childNode;
            }

            // and for every case  child wil be aqdded to chidlren
            children.add(child);
        }

        // connection were set upp now  have to find whhic data  node dpes not present in chidlren set
        for(int value:map.keySet())
        {    
            // me map ki value ko children me search kr raha hu jisse pata chle kon child me he ya nhi searching will take constant time
            if(!children.contains(value))
            {
                return map.get(value);// it return the node'
            }
        }

        //nhi to each case me null retur krp
        return null;

    }
}
