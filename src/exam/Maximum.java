package exam;

import java.util.Arrays;
import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
       int m = sc.nextInt();
       char[][] arr= new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextLine().charAt(j);
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (i < 0 || i > n || j < 0 || j > m) {
                    count++;
                    break;
                }
                if (arr[i][j] == 'D') {
                    j++;
                }
                if (arr[i][j] == 'S') {
                    i++;
                }
                if (arr[i][j] == 'W') {
                    i--;
                }
                if (arr[i][j] == 'A') {
                    j++;
                }
            }
        }
        System.out.println(count);
    }
}
