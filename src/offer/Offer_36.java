package offer;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
/*
输入两个链表，找出它们的第一个公共结点。
（注意因为传入数据是链表，所以错误测试数据的提示是用其他方式显示的，保证传入数据是正确的）
 */
import java.util.ArrayList;
import java.util.HashMap;

public class Offer_36 {
    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }}
    public ListNode FindFirstCommonNode(ListNode pHead1, ListNode pHead2) {
        ListNode current1 = pHead1;
        ListNode current2 = pHead2;


        HashMap<ListNode, Integer> hashMap = new HashMap<ListNode, Integer>();
        while (current1 != null) {
            hashMap.put(current1, null);
            current1 = current1.next;
        }
        while (current2 != null) {
            if (hashMap.containsKey(current2))
                return current2;
            current2 = current2.next;
        }

        return null;

    }

}
