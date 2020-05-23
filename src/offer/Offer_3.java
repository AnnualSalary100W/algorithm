package offer;

import java.util.ArrayList;

/*
输入一个链表，按链表从尾到头的顺序返回一个ArrayList。

 */
public class Offer_3 {

    public static class ListNode {
        int val;
        ListNode next = null;
        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        ListNode listNode=new ListNode(1);
        listNode.next = new ListNode(2);
        ListNode t = listNode.next;
        for(int i=3;i<10;i++) {//创建一个简单的链表{1,2,3,4,5,...,9}
            t.next = new ListNode(i);
            t = t.next;
        }
        System.out.println(printListFromTailToHead(listNode));
    }
        public  static  ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
            ArrayList<Integer> list =new ArrayList();
            while(listNode!=null){
                list.add(0,listNode.val);
                listNode=listNode.next;
            }

            return list;
        }

}
