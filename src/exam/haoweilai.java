package exam;

import java.util.ArrayList;
import java.util.LinkedList;

class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
}

public class haoweilai {
    public String notReCuPreOrder(TreeNode root) {
        // write code here
        if (root == null) return "";
        TreeNode current;
        LinkedList<TreeNode> s = new LinkedList<TreeNode>();
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        s.addFirst(root);
        while (!s.isEmpty()) {
            current = s.removeFirst();
            sb.append(current.val + ",");
            if (current.right != null) s.addFirst(current.right);
            if (current.left != null) s.addFirst(current.left);

        }
        return sb.substring(0, sb.length() - 1).toString();
    }
}
