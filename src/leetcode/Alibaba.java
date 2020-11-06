package leetcode;

import java.util.Scanner;

public class Alibaba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();


          int left  = 0;
          while (left < n && s.charAt(left) == '1')
              left++;
          int right = n;
          while ( right > 0 && s.charAt(right-1)== '1')
              right--;
          if (left > right){
              System.out.println(0);
              return;
          }
          s = s.substring(left,right);
            String[] counts = s.split("0");
            long count = 1;
            double num = Math.pow(10,9) + 7;
        for (int i = 0; i <counts.length ; i++) {
            count = (long) (count*(counts[i].length()+1)% num);
        }
        System.out.println(count);
        }
    }

