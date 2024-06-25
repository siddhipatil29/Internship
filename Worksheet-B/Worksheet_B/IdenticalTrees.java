package Worksheet_B;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class IdenticalTrees {

    public boolean isIdentical(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        return (p.val == q.val) && isIdentical(p.left, q.left) && isIdentical(p.right, q.right);
    }

    public static void main(String[] args) {
        IdenticalTrees solution = new IdenticalTrees();

        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2 = new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        boolean identical = solution.isIdentical(root1, root2);
        if (identical) {
            System.out.println("The two binary trees are identical.");
        } else {
            System.out.println("The two binary trees are not identical.");
        }
    }
}
