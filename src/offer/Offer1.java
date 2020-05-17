package offer;

/**
 * Offer1题目描述
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
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
