package exam;

import java.util.Arrays;
import java.util.Scanner;

public class SortCount {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int n = scanner.nextInt();
            long[] arr=new long[n];
            long[] sortArr=new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextLong();
                sortArr[i] = arr[i];
            }
            Arrays.sort(sortArr);
            int count = 0;
            int j = 0;
            for (int i = 0; i < n; i++) {
                if(arr[i] != sortArr[i]){
                    ++count;

                }
            }
            System.out.println(count);
        }
    }




