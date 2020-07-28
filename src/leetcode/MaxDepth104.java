package leetcode;

import handwritten.ByteDance.LevelOrder102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
/*
给定一个二叉树，找出其最大深度。
二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
说明: 叶子节点是指没有子节点的节点。
 */
public class MaxDepth104 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x){
            val=x;
        }
    }



        public int maxDepth(TreeNode root) {
            if (root == null) {
                return 0;
            } else {
                int leftHeight = maxDepth(root.left);
                int rightHeight = maxDepth(root.right);
                return Math.max(leftHeight, rightHeight) + 1;
            }



    }
}
