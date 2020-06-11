package leetcode;

public class DailyTemperatures {
    public static void main(String[] args) {
        int[] T=new  int[]{73, 74, 75, 71, 69, 72, 76, 73};

        System.out.println(dailyTemperatures(T));
    }
    public  static int[] dailyTemperatures(int[] T) {
             int n=T.length;
             int[] arr=new int[n];

             for (int i=0;i<n;i++){
                 int flag=0;
                 for (int j=i+1;j<n;j++){
                     if (T[i] < T[j]) {
                        arr[i]= j-i;
                         flag=1;
                        break;
                     }
                 }
                 if (flag==0){
                     arr[i]=0;
                 }

             }
             return arr;
    }
}
