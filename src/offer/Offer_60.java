package offer;

public class Offer_60 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    private int count=0;
    private TreeNode result;
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        //每次都返回一个节点很复杂，
        //所以，我可以就是进行中序遍历，然后达到k的时候就记录一下节点
        //已经找到的时候，后面就不必遍历了，就一直return就可以了
        inOrder(pRoot,k);
        return result;
    }
    private void inOrder(TreeNode pRoot, int k)
    {
        if(pRoot==null||count>=k)
        {
            return;
        }
        inOrder(pRoot.left,k);
        //中序遍历意味着count++这部分代码要在中间执行
        count++;
        if(count==k)
        {
            result=pRoot;
        }
        inOrder(pRoot.right,k);
    }
}
