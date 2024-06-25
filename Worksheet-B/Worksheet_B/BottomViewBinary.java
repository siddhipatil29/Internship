package Worksheet_B;

import java.util.*;

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

public class BottomViewBinary {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(20);
        root.left = new TreeNode(8);
        root.right = new TreeNode(22);
        root.left.left = new TreeNode(5);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(25);
        root.left.right.left = new TreeNode(10);
        root.left.right.right = new TreeNode(14);

        System.out.println("Bottom View of the Binary Tree:");
        printBottomView(root);
    }

    public static void printBottomView(TreeNode root) {
        if (root == null) {
            return;
        }

        Map<Integer, Integer> map = new TreeMap<>();

        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> hdQueue = new LinkedList<>();

        queue.offer(root);
        hdQueue.offer(0);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            int hd = hdQueue.poll();

            map.put(hd, node.val);

            if (node.left != null) {
                queue.offer(node.left);
                hdQueue.offer(hd - 1);
            }

            if (node.right != null) {
                queue.offer(node.right);
                hdQueue.offer(hd + 1);
            }
        }

        for (int key : map.keySet()) {
            System.out.print(map.get(key) + " ");
        }
        System.out.println();
    }
}
