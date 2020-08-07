package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
/*
100. 相同的树
 */
public class IsSameTree100 {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(q==null&&p==null){
            return true;
        } else if ((q==null&p!=null)|(p==null&q!=null)){
            return  false;
        }else if (p.val != q.val) {
            return false;}
        else{ return  isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
        }


    }




}
