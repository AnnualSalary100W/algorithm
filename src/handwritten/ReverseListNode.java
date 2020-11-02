package handwritten;


public class ReverseListNode {
     static class ListNode {
        int val;
        ListNode next;
        ListNode (int x) {
            val = x;
        }

        public static void main(String[] args) {
            ListNode node1 = new ListNode(1);
            ListNode node2 = new ListNode(2);
            node1.next = node2;
         ListNode node3 = reverse(node1);
            System.out.println(node3.val);
            System.out.println(node3.next.val);
        }

        public static ListNode reverse(ListNode head) {
            ListNode pre = null;
            while (head != null) {
                ListNode tem = head.next;
                head.next = pre;
                pre = head;
                head = tem;
            }
            return  pre;
        }

    }
}
