package offer;

import java.util.ArrayList;
import java.util.List;

/*
输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
要求不能创建任何新的结点，只能调整树中结点指针的指向。

 */
public class Offer_26 {
    class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;
        }
    }
    public TreeNode Convert(TreeNode pRootOfTree) {
if (pRootOfTree==null){
    return null;
}
        List<TreeNode>tmpList=new ArrayList<>();
        InOrder(pRootOfTree,tmpList);
        TreeNode head=tmpList.get(0);
        TreeNode ptr=head;
        head.left=null;
        for (int i=1;i<tmpList.size();i++){
            ptr.right=tmpList.get(i);
            tmpList.get(i).left=ptr;
            ptr=ptr.right;
        }
return head;
    }

    private void InOrder(TreeNode pRootOfTree, List<TreeNode>tmpList){
        if (pRootOfTree==null){
            return;
        }
        InOrder(pRootOfTree.left,tmpList);
        tmpList.add(pRootOfTree);
        InOrder(pRootOfTree.right,tmpList);
    }



}
