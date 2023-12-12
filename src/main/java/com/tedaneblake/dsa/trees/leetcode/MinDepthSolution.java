package com.tedaneblake.dsa.trees.leetcode;

import com.tedaneblake.dsa.queues.leetcode.BreadthFirstSearch;
import com.tedaneblake.dsa.trees.MyBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class MinDepthSolution {

    public int minDepthBFS(BreadthFirstSearch.TreeNode root) {
        if(root == null) return 0;
        Queue<BreadthFirstSearch.TreeNode> q = new LinkedList<>();

        q.add(root);
        int depth = 1;
        while(!q.isEmpty()) {
            int qSize = q.size();

            for(int i = 0; i < qSize; i++){

                BreadthFirstSearch.TreeNode currNode = q.remove();

                if(currNode.left == null && currNode.right == null){
                    return depth;
                }

                if(currNode.left != null) {
                    q.add(currNode.left);
                }
                if(currNode.right != null) {
                    q.add(currNode.right);
                }
            }
            depth++;
        }

        return depth;



    }

    private int minDepthRecursion(MyBinaryTree.TreeNode root) {
        if(root == null ) return 0;
        // test if root is a leaf/external node
        if(root.left == null && root.right == null) return 1;

        // test if either left or right is a leaf node, if it is recursive add depth from the other side subtree
        if(root.left == null) {
            return minDepthRecursion(root.right) + 1;
        }
        if(root.right == null) {
            return minDepthRecursion(root.left) + 1;
        }

        // if both are internal nodes find the minimum of the two depths
        return Math.min(minDepthRecursion(root.left) + 1, minDepthRecursion(root.right) + 1);

    }
}
