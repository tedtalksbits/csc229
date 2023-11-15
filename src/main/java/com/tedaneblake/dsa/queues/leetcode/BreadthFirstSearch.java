package com.tedaneblake.dsa.queues.leetcode;

import java.util.*;

public class BreadthFirstSearch {

    // an algorithm for searching a graph
    // breadth = broad/wide
    // The important data structure for keeping track fo vertices is a QUEUE
    // video: https://www.youtube.com/watch?v=HZ5YTanv5QE&ab_channel=MichaelSambol

    /**
     * Return the length of the shortest path between root and target node.
     */
    public static int bfs(TreeNode root, TreeNode target) {
        /*
        * first initialize the queue
        * while the queue is not empty
        *
        *
        *
        * */
        Queue<TreeNode> q = new LinkedList<>();
        Set<TreeNode> visited = null;
        int step = 0;

        q.add(root);
        visited.add(root);

        while (!q.isEmpty()){
            int queueSize = q.size();

            for (int i = 0; i < queueSize; i++) {
                TreeNode currNode = q.remove();

                if(currNode.val == target.val) {
                    return step;
                }
                TreeNode next = currNode.left;
                while (next != null) {
                    // iterate over current's neighbors
                    // if i is not in visited, add to visited and
                    visited.add(next);
                    q.add(next);
                    next = next.left;
                }

            }

            step++;

        }

        return -1;


    }

    public static List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> q = new LinkedList<>();

        List<List<Integer>> levels = new ArrayList<>();

        q.add(root);

        while (!q.isEmpty()){
            List<Integer> level = new ArrayList<>();
            int queueSize = q.size();

            for (int i = 0; i < queueSize; ++i){
                System.out.println("queueSize is: " + queueSize);
                // remove the first element - the same as dequeue or poll
                TreeNode currNode = q.remove();
                // skip null nodes
                if (currNode != null){
                    System.out.println("currentNode: "+ currNode.val);
                    System.out.println("i: " + i);
                    // we've found a level
                    level.add(currNode.val);
                    // add currNode's children to the queue
                    q.add(currNode.left);
                    q.add(currNode.right);
                }
            }
            // add level if not null
            if(!level.isEmpty())
                levels.add(level);

        }


        return levels;
    }




    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {this.val = val;}
        TreeNode(int val, TreeNode left, TreeNode right){
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }


    public static void main(String[] args) {
//        TreeNode l3Left = new TreeNode(15, null, null);
//        TreeNode l3Right = new TreeNode(7, null, null);
//        TreeNode l2Left = new TreeNode(9, null, null);
//        TreeNode l2Right = new TreeNode(20, l3Left, l3Right);
//        TreeNode root = new TreeNode(3, l2Left, l2Right);
//
//        System.out.println(levelOrder(root));


    }




}


