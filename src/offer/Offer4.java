package offer;

import java.util.Arrays;

public class Offer4 {



      public static class TreeNode {
          int val;
        TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
    public static void main(String[] args) {


    }
        public  static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
            if(pre.length==0||in.length==0){
                return null;
            }
            TreeNode node = new TreeNode(pre[0]);
            for(int i=0;i<in.length;i++){
                if(in[i]==pre[0]){
                    node.left=reConstructBinaryTree(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                    node.right=reConstructBinaryTree(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,pre.length));
                }
            }
            return node;
        }
    }

