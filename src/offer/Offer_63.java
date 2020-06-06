package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/*
从上到下按层打印二叉树，同一层结点从左至右输出。
每一层输出一行。
 */
public class Offer_63 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> list1=new  ArrayList<ArrayList<Integer>>();
        if (pRoot == null) {
            return list1;
        }
        ArrayList<Integer> list2=new ArrayList<Integer>();
        Queue<TreeNode> queue=new LinkedList<TreeNode>();

        int now=1;
        int next=0;
        queue.offer(pRoot);

        while (!queue.isEmpty()){
            TreeNode t=queue.poll();
            list2.add(t.val);
            now--;
            if (t.left!=null){
                queue.offer(t.left);
                next++;
            }
            if (t.right!=null){
                queue.offer(t.right);
                next++;
            }
            if (now==0){
                list1.add(list2);
                list2=new ArrayList<>();
                now=next;
                next=0;
            }
        }
        return list1;

    }

}
