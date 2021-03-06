package leetcode;


/*
给定一个非空二叉树，返回其最大路径和。
本题中，路径被定义为一条从树中任意节点出发，达到任意节点的序列。该路径至少包含一个节点，且不一定经过根节点。
 */
public class MaxPathSum {
    public class TreeNode {
      int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
  }
    private int max = Integer.MIN_VALUE;
  public int maxPathSum(TreeNode root) {


          dfs(root);
          return max;
      }
      public int dfs(TreeNode root) {
          //返回当前子树的最大值
          if (root == null) return 0;
          int left = dfs(root.left);
          int right = dfs(root.right);
          //当前节点为n,对于当前节点来说，最大值可以为n+left,n+right,n,n+left+right
          //上面四项中的一个，但是返回是不能返回第四个的，那种路径是不成立的
          int p = Math.max(root.val,Math.max(root.val+left,root.val+right));
          max = Math.max(max,p);
          int p2 = Math.max(p,root.val+left+right);
          max = Math.max(max,p2);
          return p;
      }
    }

