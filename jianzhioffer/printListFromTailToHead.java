//输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。

/**
*    public class ListNode {
*        int val;
*        ListNode next = null;
*
*        ListNode(int val) {
*            this.val = val;
*        }
*    }
*
*/
import java.util.*;
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        //递归，头插法，栈三种方法
        //栈法
        /*Stack<Integer> stack = new Stack<>();
        while(listNode!=null){
            stack.add(listNode.val);
            listNode = listNode.next;
        }
        ArrayList<Integer> list = new ArrayList<>();
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;*/
        //头插法
        /*
        ListNode head = new ListNode(-1);
        while (listNode != null) {
            ListNode memo = listNode.next;
            listNode.next = head.next;
            head.next = listNode;
            listNode = memo;
        }
    // 构建 ArrayList
        ArrayList<Integer> ret = new ArrayList<>();
        head = head.next;
        while (head != null) {
            ret.add(head.val);
            head = head.next;
        }
            return ret;
        
        */
        ArrayList<Integer> list = new ArrayList<>();
        if(listNode!=null){
            list.addAll(printListFromTailToHead(listNode.next));
            list.add(listNode.val);
        }
        return list;
    }
}