package jianzhioffer;

import java.util.Stack;

/**
 *〈一句话功能简述〉<br>
 *〈实现一个包含getMin函数的栈空间〉
 * 题目描述：
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 *
 * @author 一个鲁肃
 * @create 2018/8/14
 * @since 1.0.0
 */
public class MinStack {

    /**
     * 使用一个额外的栈,用来存储最小值
     */
    private Stack<Integer> minStack = new Stack<>();

    /**
     * 用于用于存储压栈的数字
     */
    private Stack<Integer> dataStack = new Stack<>();


    public void push(Integer num){
        dataStack.push(num);
        if (minStack.isEmpty()){
            minStack.push(num);
        }else if (minStack.peek() > dataStack.peek()){
            minStack.push(num);
        }else {
            minStack.push(minStack.peek());
        }
    }


    public Integer pop() throws Exception {
        if (dataStack.empty()){
            throw new RuntimeException("dataStack is empty");
        }
        minStack.pop();
        return dataStack.pop();
    }


    public Integer peek() throws Exception {
        if (dataStack.empty()){
            throw new RuntimeException("dataStack is empty");
        }
        return dataStack.peek();
    }


    public Integer getMin(){
        if (minStack.empty()){
            throw new RuntimeException("minStack is empty");
        }
        return minStack.peek();
    }


}
