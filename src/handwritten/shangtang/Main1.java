package handwritten.shangtang;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int[][] arr=new int[N][M];
        for (int i = 0; i <N ; i++) {
            for (int j = 0; j <M ; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println(longestPath(arr));
    }


    public static int[][] dirs={{-1,0},{1,0},{0,-1},{0,1}};
    public static int rows,columns;

    public static int  longestPath(int[][] arr){
        if (arr==null||arr.length==0||arr[0].length==0){
            return 0;
        }
        rows=arr.length;
        columns=arr[0].length;
        int[][] outdegrees=new int[rows][columns];
        for (int i = 0; i <rows ; i++) {
            for (int j = 0; j <columns; j++) {
                for (int[] dir:dirs){
                    int newRow=i+dir[0],newColumn=j+dir[1];
                    if (newRow>=0&&newRow<rows&&newColumn>=0&&newColumn<columns&&arr[newRow][newColumn]>arr[i][j]){
                        ++outdegrees[i][j];
                    }
                }
            }
        }
        Queue<int[]> queue=new LinkedList<int[]>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (outdegrees[i][j]==0){
                    queue.offer(new int[]{i,j});
                }
            }
        }
        int ans=0;
        while (!queue.isEmpty()){
            ++ans;
            int size=queue.size();
            for (int i = 0; i <size ; i++) {
                int[] cell=queue.poll();
                int row=cell[0],column=cell[1];
                for (int[] dir:dirs){
                    int newRow=row+dir[0],newColumn=column+dir[1];
                    if (newRow>=0&&newRow<rows&&newColumn>=0&&newColumn<columns&&arr[newRow][newColumn]<arr[row][column]){
                        --outdegrees[newRow][newColumn];
                        if (outdegrees[newRow][newColumn]==0){
                            queue.offer(new int[]{newRow,newColumn});
                        }
                    }
                }

            }
        }
        return ans;
    }
}
