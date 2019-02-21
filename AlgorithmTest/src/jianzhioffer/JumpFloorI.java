package jianzhioffer;

/**
 *〈一句话功能简述〉<br>
 *〈跳台阶〉
 * 题目描述：
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *
 * @author 一个鲁肃
 * @create 2018/8/24
 * @since 1.0.0
 */
public class JumpFloorI {

    public int jumpFloor(int n) {
        //代码的鲁棒性
        if(n <= 2){
            return n;
        }
        int first = 1;
        int second = 2;
        int result = 0;
        for(int i = 3;i < n+1;i++){
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

}
