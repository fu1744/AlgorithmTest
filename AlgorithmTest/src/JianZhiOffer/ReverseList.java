package JianZhiOffer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈反转链表〉
 *
 * @author FuJianXin
 * @create 2018/7/26
 * @since 1.0.0
 */
public class ReverseList {

    public ListNode method(ListNode head){
        //代码的鲁棒性
        if (head == null){
            return null;
        }
        //链表的第一个结点
        ListNode pre = null;
        //next结点用于存储当前结点的下一个结点
        ListNode next = null;
        //对链表进行遍历
        while(head != null){
            //进行存储
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }
        return pre;
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