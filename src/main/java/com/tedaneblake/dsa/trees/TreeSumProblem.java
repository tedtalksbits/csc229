package com.tedaneblake.dsa.trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeSumProblem {

    public static int treeSumIterative(TreeNode root) {
        if(root == null) return 0;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int totalSum = 0;

        while(!q.isEmpty()) {

            TreeNode current = q.remove();
            totalSum += current.value;

            if(current.left != null) q.add(current.left);
            if(current.right != null) q.add(current.right);
        }

        return totalSum;
    }

    public static int treeSumRecursive(TreeNode root) {
        if(root == null) return 0;
        return root.value + treeSumRecursive(root.left) + treeSumRecursive(root.right);
    }

    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(9);
        TreeNode leftNode = new TreeNode(8);
        TreeNode rightNode = new TreeNode(10);

        rootNode.left = leftNode;
        rootNode.right = rightNode;

        int sum = treeSumIterative(rootNode);
        int sum2 = treeSumRecursive(rootNode);
        System.out.println(sum);
        System.out.println(sum2);
    }
}
