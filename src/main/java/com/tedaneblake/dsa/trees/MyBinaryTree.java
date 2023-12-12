package com.tedaneblake.dsa.trees;

public class MyBinaryTree {
    private TreeNode root;
    // Method to insert a new node with the given value
    public void insert( int value) {
        root = insertNode(root, value);
    }
    // A recursive utility method to insert a new value in the binary tree
    private TreeNode insertNode(TreeNode root, int value) {

        // if the root is empty return new root
        if(root == null) {
            root = new TreeNode(value);
            return root;
        }
        // Otherwise, recur down the tree
        if(value < root.value){
            root.left = insertNode(root.left, value);
        } else if(value > root.value) {
            root.right = insertNode(root.right, value);
        }
        // Return the unchanged node pointer
        return root;
    }

    private int minDepth(TreeNode root) {
        if(root == null ) return 0;
        // test if root is a leaf/external node
        if(root.left == null && root.right == null) return 1;

        // test if either left or right is a leaf node, if it is recursive add depth from the other side subtree
        if(root.left == null) {
            return minDepth(root.right) + 1;
        }
        if(root.right == null) {
            return minDepth(root.left) + 1;
        }

        // if both are internal nodes find the minimum of the two depths
        return Math.min(minDepth(root.left) + 1, minDepth(root.right) + 1);

    }

    private void inOrderTraversal(TreeNode node) {
        if(node != null) {
            // visit left -> root -> right
            inOrderTraversal(node.left);
            System.out.println(node.value);
            inOrderTraversal(node.right);
        }
    }

    private void preOrderTraversal(TreeNode root) {
        if(root != null){
            // visit root -> left -> right
            System.out.println(root.value);
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }
    }

    private void postOrderTraversal(TreeNode root) {
        if(root != null) {
            // visit left -> right -> root
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
            System.out.println(root.value);
        }
    }

    public static class TreeNode {
        private final int value;
        public TreeNode left;
        public TreeNode right;

        public TreeNode(int value) {
            this.value = value;
            this.left = null;
            this.right = null;
        }

    }


    public static void main(String[] args) {
        MyBinaryTree tree = new MyBinaryTree();

        tree.insert(2);
        tree.insert(-1);
        tree.insert(3);
        tree.insert(-1);
        tree.insert(4);
        tree.insert(-1);
        tree.insert(5);
        tree.insert(-1);
        tree.insert(6);

        tree.inOrderTraversal(tree.root);
        tree.preOrderTraversal(tree.root);
        tree.postOrderTraversal(tree.root);

        System.out.println(tree.minDepth(tree.root));

    }
}
