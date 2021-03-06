package jianzhioffer;

import java.util.Stack;

/**
 *〈一句话功能简述〉<br>
 *〈用两个栈实现队列〉
 * 题目描述：
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 *
 * @author 一个鲁肃
 * @create 2018/7/26
 * @since 1.0.0
 */
public class TowStackForQueue {

    private Stack<Integer> stack1 = new Stack<Integer>();
    private Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            throw new RuntimeException("Queue is empty");
        } else if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

}
