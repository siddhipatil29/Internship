package Worksheet_B;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class MirrorBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        System.out.println("Original Binary Tree:");
        printTree(root);

        TreeNode mirror = convertToMirror(root);

        System.out.println("\nMirror Binary Tree:");
        printTree(mirror);
    }

    public static void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        printTree(root.left);
        System.out.print(root.val + " ");
        printTree(root.right);
    }

    public static TreeNode convertToMirror(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = convertToMirror(root.left);
        TreeNode right = convertToMirror(root.right);

        root.left = right;
        root.right = left;

        return root;
    }
}
