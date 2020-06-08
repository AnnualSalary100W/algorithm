package exam;
import java.util.*;
public class Vivo7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();
        int[] arr=new int[count];
        scanner.nextLine();
        for (int l=0;l<count-1;l++){
            arr[l]=scanner.nextInt();
        }
        scanner.nextLine();
        int oldcount=0;
        for(int i=0;i<arr.length;i++){

           if (arr[i]==1){
              oldcount++;
           }
        }
        int sum=0;
        arr[0]=(arr[1]==0)?1:0;
        for (int i=1;i<arr.length-1;i++){
            if (arr[i-1]==0&&arr[i+1]==0){
                arr[i]=1;
            }else {
                arr[i]=0;
            }
        }
        if (arr[arr.length-2]==1){
            arr[arr.length-1]=0;
        }else {
            arr[arr.length-1]=1;
        }
        for (int i=0;i<arr.length;i++){
            if (arr[i]==1){
                sum++;
            }
        }
        System.out.println(sum-oldcount);
    }

}
