package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class KthSmallest {



    public int kthSmallest(int[][] matrix, int k) {
             int m=matrix[0].length;
             int n=matrix.length;
       int[] list=new int[m*n];
       int x=0;
        for (int i=0;i<n;i++){
            for (int j=0;j<m;j++){
                list[x]=(matrix[j][i]);
                x++;
            }
        }
        Arrays.sort(list);
        return list[k-1];
    }
}
