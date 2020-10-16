package exam;

import java.util.*;

public class Wangyi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=Integer.parseInt(sc.nextLine());
      ArrayList<String>  list=new ArrayList<>();
        for (int i = 0; i < t; i++) {
            String[] line=sc.nextLine().split(" ");
            list.add(i,one(line));
        }
        for (int i = 0; i <t ; i++) {
            System.out.println(list.get(i));
        }
    }
      public  static String one(String[] nums){
          Map<Integer,Character> map=new HashMap<>();
          for (int i = 0; i <nums.length ; i++) {
              int num=nums[i].charAt(0)-'0';
              char type=nums[i].charAt(1);
              if(map.containsKey(num))return "NO";
              else map.put(num,type);
          }
          return isOK(map,'T')+isOK(map,'B')+isOK(map,'W')==7?"YES":"NO";
      }
      public static  int isOK(Map<Integer,Character> map,char type){
        int pre=0;
        int count=0;
          for (int i = 0; i <10 ; i++) {
              if (map.containsKey(i)&&map.get(i)==type){
                  if (count==0){
                      pre=i;
                      count++;
                  }
                  else if (count<=3){
                      if (pre+3!=i)return 0;
                      else {
                          pre=i;
                          count++;
                      }
                  }
                  else return 0;
              }
          }
        return count;
      }
}
