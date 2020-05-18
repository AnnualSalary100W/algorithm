package offer;

import java.util.Arrays;
import java.util.*;

public class Offer4 {



      public static class TreeNode {
          int val;
        TreeNode left;
          TreeNode right;
          TreeNode(int x) { val = x; }
      }
    public static void main(String[] args) {

        System.out.println(new Offer4().reConstructBinaryTree(new int[]{1,2,4,7,3,5,6,8},new int[]{4,7,2,1,5,3,8,6}));
    }
        public  TreeNode reConstructBinaryTree(int [] pre,int [] in) {
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

