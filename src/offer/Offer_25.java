package offer;



/*
public class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}
*/

/*
 * 输入一个复杂链表（每个节点中有节点值，以及两个指针，一个指向下一个节点，另一个特殊指针random指向一个随机节点），
 * 请对此链表进行深拷贝，并返回拷贝后的头结点。
 * （注意，输出结果中请不要返回参数中的节点引用，否则判题程序会直接返回空）
 */

import java.util.HashMap;

public class Offer_25 {
    public class RandomListNode {
        int label;
        RandomListNode next = null;
        RandomListNode random = null;

        RandomListNode(int label) {
            
            this.label = label;
        }
    }

        public RandomListNode Clone(RandomListNode pHead){
            HashMap<RandomListNode, RandomListNode> map = new HashMap<RandomListNode, RandomListNode>();
            RandomListNode cur = pHead;
            while (cur != null) {
                map.put(cur, new RandomListNode(cur.label));
                cur = cur.next;
            }
            cur = pHead;
            while (cur != null) {
                map.get(cur).next = map.get(cur.next);
                cur = cur.next;
            }
            RandomListNode resHead = map.get(pHead);
            cur = pHead;
            while (cur != null) {
                map.get(cur).random = map.get(cur.random);
                cur = cur.next;
            }
            return resHead;


}}
