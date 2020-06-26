package leetcode;

import java.util.HashMap;
import java.util.HashSet;

/*

移除重复节点

 */

public class RemoveDuplicateNodes {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode removeDuplicateNodes(ListNode head) {
        HashSet<Integer> hashSet=new HashSet<>();
        if (head == null) {
            return head;
        }
        ListNode temp=head;
        hashSet.add(head.val);
        while (temp.next!=null){
            ListNode cur = temp.next;
        if (hashSet.add(cur.val)){
            temp=temp.next;
        }else {
            temp.next=temp.next.next;
        }

        }
        temp.next=null;
        return head;
    }
}