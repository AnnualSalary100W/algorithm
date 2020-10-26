package exam;

import java.util.ArrayList;
import java.util.Scanner;

public class beike2 {
   static   int flag = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            ArrayList<Long> list1 = new ArrayList<>();
            long x = sc.nextInt();
            long y = sc.nextInt();
            long z = sc.nextInt();
            sc.nextLine();
         list1 = findx(x , y , z);

         if (list1.size() == 0) {
             System.out.println("NO");
         } else {
             System.out.println("YES");
             System.out.println(list1.get(0)+ " " +list1.get(1) + " " + list1.get(2));
         }
        }
    }
    public static ArrayList<Long> findx(long x , long y , long z){
        ArrayList<Long> list = new ArrayList<>();
        if (x != y && y != z && x != z) {
            return new ArrayList<>();
        }
        if (x == y && y == z){
            flag = 1;
            list.add(x);
            list.add(y);
            list.add(z);
            return list;
        }
        if (x == y && y != z) {
            list.add(x);
            list.add(z);
            list.add(z);
            return list;
        }
        if (x == y && y != z) {
            list.add(x);
            list.add(z);
            list.add(z);
            return list;
        }
        if (x == z && z != y) {
            list.add(x);
            list.add(y);
            list.add(y);
            return list;
        }
        if (y == z && z != x) {
            list.add(y);
            list.add(x);
            list.add(x);
            return list;
        }
        return new ArrayList<>();
    }
}
