package exam;

import java.util.Scanner;

public class SelectSort {
    public static void main(String[] args) {
        //模拟数据
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();

        }
//        int[] array = {52,63,14,59,68,35,8,67,45,99};
//        System.out.println("原数组：");
//        for (int i : array) {
//            System.out.print(i+" ");
//        }
//        System.out.println();
        System.out.println(selectSort(arr));
//        selectSort(array);
//        System.out.println("排序后：");
//        for (int i : array) {
//            System.out.print(i+" ");
//        }
//        System.out.println(selectSort(array));
    }

    public static int selectSort(int[] arr){
int count=0;
        for(int i = 0; i < arr.length-1; i++){
            int min = i;
            for(int j = i+1; j <arr.length ;j++){
                if(arr[j]<arr[min]){
                    min = j;
                }
            }
            if(min!=i){
                swap(arr, i, min);
count++;
            }
        }
return count;
    }
    //完成数组两元素间交换
    public static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
