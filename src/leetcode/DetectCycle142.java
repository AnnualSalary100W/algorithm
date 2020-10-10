package leetcode;

public class DetectCycle142 {
     class ListNode {
     int val;
     ListNode next;
     ListNode(int x) {
         val = x;
         next = null;
     }
         public ListNode detectCycle(ListNode head) {
             if (head == null || head.next == null){
                 return null;
             }
             ListNode fast = head, slow = head, pre = null;
             while (fast != null) {
                 slow = slow.next;
                 if (fast.next != null) {
                     fast = fast.next.next;
                 } else {
                     return null;
                 }
                 if (fast == slow) {
                     ListNode ptr = head;
                     while (ptr != slow) {
                         ptr = ptr.next;
                         slow = slow.next;
                     }
                     return ptr;
                 }
             }
             return null;
         }
 }


}
