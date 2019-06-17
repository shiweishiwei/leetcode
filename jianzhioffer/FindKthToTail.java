//输入一个链表，输出该链表中倒数第k个结点。

/*
public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
import java.util.*;

public class Solution {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode p1 = head;
        ListNode p2 = head;
        while (p1 != null && k-- > 0)
            p1 = p1.next;
        if (k > 0) return null;
        while(p1!=null){
            p1 = p1.next;
            p2 = p2.next;            
        }
        return p2;
    }
    
/*public ListNode FindKthToTail(ListNode head, int k) {
    if (head == null)
        return null;
    ListNode P1 = head;
    while (P1 != null && k-- > 0)
        P1 = P1.next;
    if (k > 0)
        return null;
    ListNode P2 = head;
    while (P1 != null) {
        P1 = P1.next;
        P2 = P2.next;
    }
    return P2;
}*/

}