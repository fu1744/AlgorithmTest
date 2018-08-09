package jianzhioffer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 〈一句话功能简述〉<br> 
 * 〈从头到尾打印链表〉
 *
 * @author FuJianXin
 * @create 2018/7/26
 * @since 1.0.0
 */
public class printListFromTailToHead {

    /**
     * 功能描述: <br>
     *〈这种是使用额外空间栈的解法〉
     *
     * @param：listNode
     * @return:
     * @since: 1.0.0
     * @Author:FuJianXin
     * @Date: 2018/7/26 0:37
     */
    public ArrayList<Integer> method1(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        while(listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while(!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;
    }


    /**
     * 功能描述: <br>
     *〈这种是反转链表的解法〉
     *
     * @param：listNode
     * @return:
     * @since: 1.0.0
     * @Author:FuJianXin
     * @Date: 2018/7/26 0:37
     */
    public ArrayList<Integer> method2(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        ListNode head = listNode;
        ListNode pre = null;
        ListNode next = null;
        while(head != null){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        while(pre != null){
            list.add(pre.val);
            pre = pre.next;
        }
        return list;
    }
}


