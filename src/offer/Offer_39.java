package offer;
/*
输入一棵二叉树，判断该二叉树是否是平衡二叉树。
在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树
 */
public class Offer_39 {

     public class TreeNode {
     int val = 0;
     TreeNode left = null;
     TreeNode right = null;

     public TreeNode(int val) {
     this.val = val;

     }

     }

    public class Solution {
        public int TreeDepth(TreeNode root) {
            if (root==null){
                return 0;
            }
            int leftDepth=TreeDepth(root.left);
            int rightDepth=TreeDepth(root.right);
            return Math.max(leftDepth+1,rightDepth+1);
        }
        public boolean IsBalanced_Solution(TreeNode root) {
            if (root==null)
                return true;
            int leftHeight=TreeDepth(root.left);
            int rightHeight=TreeDepth(root.right);
            int diff=Math.abs(leftHeight-rightHeight);
            if (diff>1){
                return false;
            }
            return IsBalanced_Solution(root.left)&&IsBalanced_Solution(root.right);
        }
    }
}



