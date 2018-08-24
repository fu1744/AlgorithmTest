package jianzhioffer;

import java.util.Stack;

/**
 *〈一句话功能简述〉<br>
 *〈栈的压入、弹出序列〉
 *
 * @author 一个鲁肃
 * @create 2018/8/14
 * @since 1.0.0
 */
public class IsPopOrder {


    public boolean isPopOrder(int [] pushA,int [] popA) {
        if (pushA.length == 0 || popA.length == 0){
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        //记录弹出序列的未知
        int index = 0;
        for (int aPushA : pushA) {
            stack.push(aPushA);
            while (!stack.isEmpty() && stack.peek() == popA[index]) {
                //入栈序列与出栈序列比较的过程
                stack.pop();
                index++;
            }
        }
        return stack.empty() ? true : false;
    }

}
