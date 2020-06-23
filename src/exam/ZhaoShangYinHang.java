package exam;

import java.util.Scanner;

public class ZhaoShangYinHang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        sc.nextLine();

        for (int j=0;j<k;j++){
           arr= zhaoshangyinhang(n,arr);
        }
        for (int l=0;l<n;l++){
            System.out.print(arr[l]+" ");
        }

    }


    public static int[] zhaoshangyinhang(int n,int[] arr){
        int[] arr1=new int[n];
        if (n%2==0){
            int j=0;
            for (int i=0;i<n;i=i+2){
                arr1[i]=arr[j];
               j++;
            }
            j=n/2;
            for (int i=1;i<n;i=i+2){
                    arr1[i]=arr[j];
                    j++;

            }
        }

        if (n%2==1){
          arr1[0]=arr[0];
          int j=1;
            for (int i=1;i<n;i=i+2){

                    arr1[i]=arr[j];
                    j++;

            }
            j=n/2+1;
            for (int i=2;i<n;i=i+2){

                    arr1[i]=arr[j];
                j++;
            }
        }
        return arr1;
    }
}
