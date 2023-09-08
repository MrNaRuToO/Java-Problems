package pages ;
class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    TreeNode root;

    // Function to find the smallest element in the binary tree
    public int findSmallestElement(TreeNode node) {
        if (node == null) {
            // If the tree is empty, return a large integer to indicate that there's no minimum element
            return Integer.MAX_VALUE;
        }

        int leftSmallest = findSmallestElement(node.left);
        int rightSmallest = findSmallestElement(node.right);

        // Compare the current node's value with the minimum values from the left and right subtrees
        return Math.min(node.data, Math.min(leftSmallest, rightSmallest));
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Construct a binary tree
        tree.root = new TreeNode(10);
        tree.root.left = new TreeNode(5);
        tree.root.right = new TreeNode(20);
        tree.root.left.left = new TreeNode(3);
        tree.root.left.right = new TreeNode(7);

        int smallestElement = tree.findSmallestElement(tree.root);
        System.out.println("The smallest element in the binary tree is: " + smallestElement);
    }
}
