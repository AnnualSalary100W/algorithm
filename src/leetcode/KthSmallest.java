package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

/*
给定一个 n x n 矩阵，其中每行和每列元素均按升序排序，找到矩阵中第 k 小的元素。
请注意，它是排序后的第 k 小元素，而不是第 k 个不同的元素。
 */
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
