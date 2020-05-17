package offer;

public class Offer1 {
    public static void main(String[] args) {
        int[][] array = {{1,2,3},{4,5,6}};
        int target=9;
        System.out.println(Find(target,array));
    }
    public static boolean Find(int target, int [][] array) {
        int lines=array.length;
        int cols=array[0].length;
        int x=lines-1;
        int y=0;
        while(x>=0&&y<cols){
            if(array[x][y]==target){
                return true;
            }
            if(array[x][y]<target){
                y++;
            }
            else{
                x--;
            }
        }
        return false;
    }
}
