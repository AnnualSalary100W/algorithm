package exam;

import java.io.*;

/**
 * Welcome to vivo !
 */
/*
1、给出一些不同颜色的豆子，豆子的颜色用数字（0-9）表示，即不同的数字表示不同的颜色；
2、通过不断地按行消除相同颜色且连续的豆子来积分，直到所有的豆子都消掉为止；
3、假如每一轮可以消除相同颜色的连续 k 个豆子（k >= 1），这样一轮之后小v将得到 k*k 个积分；
4、由于仅可按行消除，不可跨行或按列消除，因此谓之“一维消消乐”。
 */
public class Vivo4{

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputStr = br.readLine();
        int input[] = parseInts(inputStr.split(" "));
        int output = solution(input);
        System.out.println(output);
    }

    private static int[] parseInts(String[] strArr) {
        if (strArr == null || strArr.length == 0) {
            return new int[0];
        }
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }

    private static int solution(int[] input) {

        if(input == null || input.length == 0){
            return 0;
        }
        int len = input.length;
        return DFS(input, len);

    }
    public static int DFS(int[] arr, int len){
        if(len == 1){
            return 1;
        }
        if(len == 2){
            if(arr[0] == arr[1]){
                return 4;
            }else{
                return 2;
            }
        }
        int max = 0;
        int L = 0;
        for(int i = 1; i < len; i++){
            if(arr[i] != arr[L]){
                int[] copy = new int[len - (i - L)];
                int j = 0;
                for(; j < L; j++){
                    copy[j] = arr[j];
                }
                for(int r = i; r < len; r++){
                    copy[j++] = arr[r];
                }
                max = Math.max(max, DFS(copy, copy.length) + (i - L)*(i - L));
                L = i;
            }
        }
        if(L == 0){
            return len * len;
        }
        int[] copy = new int[L];
        for(int j = 0; j < L; j++){
            copy[j] = arr[j];
        }
        max = Math.max(max, DFS(copy, copy.length) + (len - L) * (len - L));
        return max;
    }

}