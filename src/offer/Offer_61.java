package offer;
 import java.util.*;
public class Offer_61 {
private PriorityQueue<Integer> queue1=new PriorityQueue<>(((o1, o2) -> o2-o1));
    private PriorityQueue<Integer> queue2=new PriorityQueue<>();
     private     int sum=0;
    public void Insert(Integer num) {
          if (sum%2==0){
              queue1.add(num);
          }else {
              queue2.add(num);
          }
          if (!queue2.isEmpty()&&queue1.peek()>queue2.peek()){
              assert !queue1.isEmpty();
              int temp1=queue1.poll();
              int temp2=queue2.poll();
              queue1.add(temp2);
              queue2.add(temp1);

          }
          sum++;
    }

    public Double GetMedian() {
        if (sum%2==1){
            return (double)queue1.peek();
        }else {
            return  (queue1.peek()+queue2.peek())/2.0;
        }

    }

}
