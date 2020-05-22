package offer;

import java.util.ArrayList;

public class Offer_24 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result= new ArrayList<>();
        if(root==null){
            return result;
        }
        find(root,0,target,new ArrayList<>(),result);
        return result;
    }
    private void  find(TreeNode node,int sum,int target,ArrayList<Integer> list,ArrayList<ArrayList<Integer>> result){
        //递归结束条件
        if(node==null && sum==target && !result.contains(list)){
            result.add(list);
            return;
        }
        if (node==null) {
            return;
        }
        //业务处理
        sum=node.val+sum;
        list.add(node.val);
        if (sum>target){
            return;
        }
        find(node.left,sum,target,new ArrayList<>(list),result);
        find(node.right,sum,target,new ArrayList<>(list),result);
    }

}
