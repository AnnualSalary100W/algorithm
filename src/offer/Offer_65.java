package offer;
import java.util.*;
/*
地上有一个m行和n列的方格。
一个机器人从坐标0,0的格子开始移动，
每一次只能向左，右，上，下四个方向移动一格，
但是不能进入行坐标和列坐标的数位之和大于k的格子。
例如，当k为18时，机器人能够进入方格（35,37），因为3+5+3+7 = 18。
但是，它不能进入方格（35,38），因为3+5+3+8 = 19。请问该机器人能够达到多少个格子？
 */
public class Offer_65 {

    public int movingCount(int threshold, int rows, int cols)
    {
        if (threshold < 0 || rows <= 0 || cols <= 0)
            return 0;
        boolean[] visited = new boolean[rows*cols];

        return moveCount(threshold, rows, cols, 0, 0, visited);
    }

    public int moveCount(int threshold, int rows, int cols, int row, int col, boolean[] visited) {
        int count = 0;
        if (isOK(threshold, row, col) && row >= 0 && col >= 0 && row < rows && col < cols && !visited[cols*row+col]) {
            visited[row*cols + col] = true;
            count = 1 + moveCount(threshold, rows, cols, row-1, col, visited) +
                    moveCount(threshold, rows, cols, row, col-1, visited) +
                    moveCount(threshold, rows, cols, row+1, col, visited) +
                    moveCount(threshold, rows, cols, row, col+1, visited);
        }
        return count;
    }

    // 判断即将进入个格子行坐标和列坐标的数位之和是否大于k
    public boolean isOK(int threshold, int row, int col){
        int sum = 0;
        while (row != 0){
            sum += (row%10);
            row /= 10;
        }
        while (col != 0){
            sum += (col%10);
            col /= 10;
        }
        if (sum > threshold)
            return false;
        else
            return true;
    }
}
