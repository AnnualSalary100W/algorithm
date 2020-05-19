package offer;

import java.util.Stack;

public class Offer_21 {
    public static void main(String[] args) {
        int[] pushA={1,2,3,4,5};
        int[] popA={4,5,3,1,2};
        System.out.println(IsPopOrder(pushA,popA));
    }

    public static boolean IsPopOrder(int [] pushA,int [] popA) {
     if (pushA.length!=popA.length){
         return false;
     }
     if (pushA.length<1){
         return true;
     }
        Stack<Integer>stack=new Stack<>();
     stack.push(pushA[0]);
     int i=1;
     for (int j=0;j<popA.length;j++){
         int num =popA[j];
         while (stack.peek()!=num&&i<pushA.length){
             stack.push(pushA[i++]);
         }
         if (stack.peek()==num){
             stack.pop();
             continue;
         }
         return  false;
     }
     return true;
    }
}
