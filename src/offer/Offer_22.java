package offer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

/*
 * 题目描述
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 */
class Offer_22 {

    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }
    public    ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> result=new ArrayList<>();
        if (root==null){
        return  result;
        }
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode node=queue.poll();
            result.add(node.val);
            if (node.left!=null){
                queue.add(node.left);
            }
            if (node.right!=null){
                queue.add(node.right);
            }
        }
       return result;
    }


    }


}
