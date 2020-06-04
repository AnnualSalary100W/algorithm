package offer;

import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
/*
请实现一个函数按照之字形打印二叉树，即第一行按照从左到右的顺序打印，
第二层按照从右至左的顺序打印，第三行按照从左到右的顺序打印，
其他行以此类推。
 */
public class Offer_59 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> layers = new ArrayList<ArrayList<Integer>>();
        if (pRoot == null)
            return layers;
        Deque<TreeNode> queue = new LinkedList<TreeNode>();

        queue.offer(pRoot);
        int depth = 0;
        while (!queue.isEmpty()) {
            depth ++;
            ArrayList<Integer> layer = new ArrayList<Integer>();
            int cur = 0, size = queue.size();
            if ((depth & 1) == 0) { //如果是偶数层倒序添加
                Iterator<TreeNode> it = queue.descendingIterator();
                while (it.hasNext()) {
                    layer.add(it.next().val);
                }
            }
            else { //如果是奇数层正序添加
                Iterator<TreeNode> it = queue.iterator();
                while (it.hasNext()) {
                    layer.add(it.next().val);
                }
            }
            while (cur < size) {
                TreeNode node = queue.poll();

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }

                cur ++;
            }
            layers.add(layer);
        }
        return layers;
    }
}
