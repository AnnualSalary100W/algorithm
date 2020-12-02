package handwritten.xiaomi;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char[][] arr=new char[][]{
                {'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String s= scanner.nextLine();
        if (s.length()==0||s.equals(" ")){
            System.out.println(false);
              return;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                boolean[][] flag=new boolean[3][4];
                if (arr[i][j]==s.charAt(0)&&search(arr,s)){
                    System.out.println(true);
                    return;
                }
            }

        }
        System.out.println(false);
    }
   static boolean[][] arr1;
    public   static boolean search(char[][] board,String word){

        if (board==null||board.length==0||board[0].length==0){
            return false;
        }
        arr1=new boolean[board.length][board[0].length];
        if(word==null||word.length()==0)return true;

        if (dfs(board,word,0,0,0)){
            return true;
        }
        else {
            return false;
        }
    }

    public static boolean dfs(char[][] board,String word,int start,int x,int y){
        if (start==word.length()) return true;

        char temp=word.charAt(start);

        if (start==0){
            for (int i = 0; i <board.length ; i++) {
                for (int j = 0; j <board[0].length ; j++) {
                    if (board[i][j]==temp){
                        arr1[i][j]=true;
                        if (dfs(board,word,start+1,i,j)) return true;
                        arr1[i][j]=false;
                    }
                }
            }

            return false;

        }
        else {
            if (y-1>=0){
                if (board[x][y-1]==temp&&!arr1[x][y-1]){
                    arr1[x][y-1]=true;
                    if (dfs(board,word,start+1,x,y-1))
                        return true;
                    arr1[x][y-1]=false;

                }
            }
            if (x-1>=0){
                if (board[x-1][y]==temp&&!arr1[x-1][y]){
                    arr1[x-1][y]=true;
                    if (dfs(board,word,start+1,x-1,y))
                        return true;
                    arr1[x-1][y]=false;

                }
            }
            if (y+1<board[0].length){
                if (board[x][y+1]==temp&&!arr1[x][y+1]){
                    arr1[x][y+1]=true;
                    if (dfs(board,word,start+1,x,y+1))
                        return true;
                    arr1[x][y+1]=false;

                }
            }
            if (x+1<board.length){
                if (board[x+1][y]==temp&&!arr1[x+1][y]){
                    arr1[x+1][y]=true;
                    if (dfs(board,word,start+1,x+1,y))
                        return true;
                    arr1[x+1][y]=false;

                }
            }
            return false;
        }
    }
}
