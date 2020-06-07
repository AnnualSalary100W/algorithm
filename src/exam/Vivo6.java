package exam;
import java.util.*;
/*
种草问题
 */
public class Vivo6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count =scanner.nextInt();
        int[] arr=new int[count];
        if (scanner.hasNext()){
           scanner.nextLine();
            for (int i=0;i<count;i++){
                arr[i]= scanner.nextInt();
            }
        }
        scanner.nextLine();
        int count2=0;
        if (arr[0]==0&&arr[1]==0){
            arr[0]=1;
            count2=1;
        }
        for (int j=1;j<count-1;j++){
           if (arr[j]==0&&arr[j+1]==0){
               if (arr[j-1]==0){
                   arr[j]=1;
                   count2++;
               }

           }
        }
        if (arr[count-1]==0&&arr[count-2]==0){
            count2++;
        }
        System.out.println(count2);
    }


}
