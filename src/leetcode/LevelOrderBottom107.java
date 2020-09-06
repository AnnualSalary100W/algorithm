package leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LevelOrderBottom107 {
    public class TreeNode {
      int val;
      TreeNode left;
     TreeNode right;
      TreeNode(int x) { val = x; }
  }
    List<List<Integer>> ans;
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        ans = new ArrayList<>();
        dfs(root, 0);
        Collections.reverse(ans);
        return ans;
    }

    public void dfs(TreeNode root, int level) {
        if (root == null) {
            for (int i = ans.size(); i < level; ++i) {
                ans.add(new ArrayList<>());
            }
            return;
        }
        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
        ans.get(level).add(root.val);
    }
}
