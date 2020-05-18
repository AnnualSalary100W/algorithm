package offer;

import java.util.ArrayList;

/**
 * 输入一个矩阵，按照从外向里以顺时针的顺序依次打印出每一个数字，
 * 例如，如果输入如下4 X 4矩阵： 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16
 * 则依次打印出数字1,2,3,4,8,12,16,15,14,13,9,5,6,7,11,10.
 *
 *
 */
public class Offer19 {

    public static void main(String[] args) {
        System.out.println(new Offer19().printMatrix(new int[][]{{1},{2},{3},{4},{5}}));
    }
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        ArrayList<Integer> list =new ArrayList<>();
        int m=matrix.length;
        if (m==0){
            return list;
        }
        int n=matrix[0].length;
        int c1=0;
        int c2=n-1;
        int r1=0;
        int r2=m-1;
        int times=Math.min(m,n)%2==0?Math.min(m,n)/2:Math.min(m,n)/2+1;
        for(int i=0;i<times;i++){
            for (int c=c1;c<=c2;c++){
                list.add(matrix[r1][c]);
            }
            for (int r=r1+1;r<=r2;r++){
                list.add(matrix[r][c2]);
            }
if (r1<r2&&c1<c2){
    for (int c=c2-1;c>c1;c--){
        list.add(matrix[r2][c]);
    }
    for (int r=r2;r> r1;r--){
        list.add(matrix[r][c1]);
    }
}
r1++;
r2--;
c1++;
c2--;
        }
return list;
    }
}
