package offer;

/*
给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */

public class Offer_55 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ListNode EntryNodeOfLoop(ListNode pHead)
   {
     ListNode p1=pHead;
     ListNode p2=pHead;
     //先双指针确定存在环
       while (p2!=null&&p2.next!=null){
           p1=p1.next;
           p2=p2.next.next;
           //再从头开始找，第一个入环的位置
           if(p1==p2)
           {
               p1=pHead;
               while(p1!=p2)
               {
                   p1=p1.next;
                   p2=p2.next;
               }
               if(p1==p2)return p1;
           }

       }
       return null;

  }

}
