package com.tedaneblake.dsa.trees;

import java.util.LinkedList;
import java.util.Queue;

public class TreeMinValueProblem {

    static int minValue(TreeNode root) {
        if(root == null) return 0;
        int min = root.value;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            TreeNode current = q.remove();
            min = Math.min(min, current.value);
            if(current.left != null) {
                q.add(current.left);
            }
            if(current.right != null) {
                q.add(current.right);
            }
        }

        return min;
    }

    static int minValueRecursive(TreeNode root) {
        if(root == null) return 0;
        // test if root is a leaf node
        if(root.left == null && root.right == null) {
            return root.value;
        }
        /*
        *               9
        *       8               10
        *   1       11      null      null
        *
        *
        *
        * */
        // test left is a leaf
        if(root.left == null) {
            return minValueRecursive(root.right);
        }
        if(root.right == null) {
            return minValueRecursive(root.left);
        }

        return Math.min(minValueRecursive(root.left), minValueRecursive(root.right));
    }

    public static void main(String[] args) {
        TreeNode rootNode = new TreeNode(9);
        TreeNode l1LeftNode = new TreeNode(8);
        TreeNode l1RightNode = new TreeNode(10);
        rootNode.left = l1LeftNode;
        rootNode.right = l1RightNode;

        TreeNode l2LeftNode = new TreeNode(1);
        TreeNode l2RightNode = new TreeNode(11);
        l1LeftNode.left = l2LeftNode;
        l1LeftNode.right = l2RightNode;




        System.out.println(minValue(rootNode));
        System.out.println(minValueRecursive(rootNode));
    }
}
