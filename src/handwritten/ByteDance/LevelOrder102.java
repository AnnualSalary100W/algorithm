package handwritten.ByteDance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
102. 二叉树的层序遍历
给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 */
public class LevelOrder102 {
    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode (int x){
            val=x;
        }
    }


    public List<List<Integer>> levelOrder(TreeNode root){
        List<List<Integer>> res=new ArrayList<>();

        if(root==null){
            return res;
        }

        Queue<TreeNode> q=new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()){
            int count =q.size();
            List<Integer> list=new ArrayList<>();
            while (count>0){
                TreeNode tem=q.peek();
                q.poll();
                list.add(tem.val);
                if (tem.left!=null) q.add(tem.left);
                if (tem.right!=null) q.add(tem.right);
                count--;
            }
            res.add(list);
        }

return res;
    }
}
