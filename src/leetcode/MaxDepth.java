package leetcode;

import handwritten.ByteDance.LevelOrder102;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class MaxDepth {
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
