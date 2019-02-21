package jianzhioffer;

/**
 *〈一句话功能简述〉<br>
 *〈合并两个排序链表〉
 * 题目描述：
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 *
 * @author 一个鲁肃
 * @create 2018/7/26
 * @since 1.0.0
 */
public class Merge {

    /**
     * 功能描述: <br>
     *〈递归解法〉
     *
     * @param：list1 list2
     * @return: ListNode
     * @since: 1.0.0
     * @Author: 一个鲁肃
     * @Date: 2018/7/27 18:04
     */
    private ListNode method1(ListNode list1, ListNode list2) {
        //代码的鲁棒性，当两个链表有一个为null，那么就将返回另一个
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        //说明list1的头结点更小
        if (list1.val <= list2.val){
            list1.next = method1(list1.next,list2);
            return list1;
        }else {
            list2.next = method1(list1,list2.next);
            return list2;
        }
    }

    /**
     * 功能描述: <br>
     *〈非递归解法〉
     *
     * @param：list1 list2
     * @return: ListNode
     * @since: 1.0.0
     * @Author: 一个鲁肃
     * @Date: 2018/7/27 18:04
     */
    public ListNode method2(ListNode list1,ListNode list2) {
        //代码的鲁棒性，当两个链表有一个为null，那么就将返回另一个
        if (list1 == null){
            return list2;
        }
        if (list2 == null){
            return list1;
        }
        //记录连接节点
        ListNode cur = null;
        //记录合并之后的头结点
        ListNode head = null;
        while (list1 != null && list2 != null){
            if (list1.val <= list2.val){
                if (head == null){
                    head = cur = list1;
                }else {
                    cur.next = list1;
                    cur = cur.next;
                }
                list1 = list1.next;
            }else {
                if (head == null){
                    head = cur = list2;
                }else {
                    cur.next = list2;
                    cur = cur.next;
                }
                list2 = list2.next;
            }
        }
        //当有一个链表指向null时，用连接节点cur连接另一个链表
        if (list1 == null){
            cur.next = list2;
        }
        if (list2 == null){
            cur.next = list1;
        }

        return head;
    }

}

/*
node结点类

public class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}*/
