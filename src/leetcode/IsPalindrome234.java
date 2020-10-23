package leetcode;

import java.util.LinkedList;
import java.util.List;

public class IsPalindrome234 {
    public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new LinkedList<Integer>();
        while (head != null) {
            list.add (head.val);
            head = head.next;
        }
        int n = list.size();
        int left = 0 , right = n - 1;
        while (left < right) {
            if (!list.get(left).equals(list.get(right))) {
                return false;
            }
            ++left;
            --right;
        }
        return true;
    }
}
