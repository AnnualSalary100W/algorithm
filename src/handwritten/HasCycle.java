package handwritten;
/*
单链表有环
 */
public class HasCycle {
    class ListNode{
        int val;
        ListNode next;
      ListNode (int x){
          val=x;
          next=null;
      }
    }


    public boolean hasCycle(ListNode head){
        ListNode first=head;
        ListNode slow=head;
        while (first!=null&&first.next!=null){
            first=first.next.next;
            slow=slow.next;
            if (first==slow){return true;}
        }
        return false;
    }
}
