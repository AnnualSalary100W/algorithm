package leetcode;

public class Exist {
    int[] dx = {-1, 1, 0, 0};
    int[] dy = {0, 0, -1, 1};
    int m, n;
    public boolean exist(char[][] board, String word) {
        m = board.length;
        n = board[0].length;
        int[][] isVisited = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == word.charAt(0)) {
                    if (dfs(board, word, i, j, 1, isVisited)) return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][] board, String word, int x, int y, int k, int[][] isVisited) {
        if (k >= word.length()) return true;
        isVisited[x][y] = 1;
        for (int i = 0; i < 4; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];
            if (newX >= 0 && newX < m && newY >= 0 && newY < n && isVisited[newX][newY] == 0) {
                if (board[newX][newY] == word.charAt(k)) {
                    if (dfs(board, word, newX, newY, k+1, isVisited)) return true;
                }
            }
        }
        isVisited[x][y] = 0;
        return false;
    }
}
