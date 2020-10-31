package handwritten;

public class FindTatget {
    public static void main(String[] args) {
        int[][] array = {{1, 3, 5, 7, 9}, {2, 4, 6, 8, 10}, {3, 5, 7, 9, 11}, {10, 20, 30, 40, 50}, {100, 200, 300, 400, 500}};
        System.out.println(findtarget(array ,60));
    }
    public static boolean  findtarget (int[][] array ,int target) {
        int row = 0;
        int col = array[0].length - 1;
        while (row <= array.length -1 && col >= 0) {
            if (array[row][col] == target) {
                return true;
            } else if (array[row][col] < target) {
                row++;
            } else col--;
        }
        return  false;
    }
}
