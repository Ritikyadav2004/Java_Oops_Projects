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

    // Insert element in Binary Search Tree
    public node insert(node root, int val) {
        if (root == null) {
            return new node(val);
        }
        
        if (val < root.data) {
            root.left = insert(root.left, val);
        } else if (val > root.data) {
            root.right = insert(root.right, val);
        }
        
        return root;
    }

    // Calculate height of tree
    public int getHeight(node root)
    {
        if(root==null) return 0;

        int left=getHeight(root.left);
        int right=getHeight(root.right);

        return 1+ Math.max(left, right);
    }

    // In-order traversal (Left, Root, Right)
    public void inorder(node root) {
        if (root == null) return;
        
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    // Pre-order traversal (Root, Left, Right)
    public void preorder(node root) {
        if (root == null) return;
        
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void main(String[] args) {
        HeightOfBinaryTree tree = new HeightOfBinaryTree();
        node root = null;

        // Insert elements
        root = tree.insert(root, 10);
        root = tree.insert(root, 5);
        root = tree.insert(root, 15);
        root = tree.insert(root, 3);
        root = tree.insert(root, 7);
        root = tree.insert(root, 12);
        root = tree.insert(root, 20);

        System.out.println("In-order traversal:");
        tree.inorder(root);
        System.out.println();

        System.out.println("Pre-order traversal:");
        tree.preorder(root);
        System.out.println();

        System.out.println("Height of tree: " + tree.getHeight(root));
    }
}