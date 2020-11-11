package exam;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.ArrayList;

public class sougou {
    public static void main(String[] args) {
        String[] s1=new String[]{"1101","1010","1111","1110"};

        String[] s2=new String[]{"ABCD","EFGH","IJKL","MNPQ"};
        System.out.println(rotatePassword(s1,s2));

    }
    public  static String rotatePassword (String[] s1, String[] s2) {
        // write code here
        int n =s1.length;
        char[][] matrix = new char[n][n];
        char[][] result = new char[n][n];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n ; i++) {
            matrix[i] = s1[i].toCharArray();
            result[i] = s2[i].toCharArray();
        }
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j]== '0')
                    sb.append(result[i][j]);
            }
        }
        for (int i = 0; i <n ; i++) {
            for (int j =n-1; j >= 0; j--) {
                if (matrix[j][i]== '0')
                    sb.append(result[i][n-j-1]);
            }
        }
        for (int i = n-1; i >=0 ; i--) {
            for (int j = n-1; j >= 0; j--) {
                if (matrix[i][j]== '0')
                    sb.append(result[n-i-1][n-j-1]);
            }
        }
        for (int i = n-1; i >=0 ; i--) {
            for (int j = 0; j < n; j++) {
                if (matrix[j][i]== '0')
                    sb.append(result[n-i-1][j]);
            }
        }
        return  sb.toString();


    }


}
