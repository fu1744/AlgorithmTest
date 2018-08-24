package jianzhioffer;

/**
 *〈一句话功能简述〉<br>
 *〈变态跳台阶〉
 * 题目描述：
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *
 * @author 一个鲁肃
 * @create 2018/7/31
 * @since 1.0.0
 */
public class JumpFloorII {

    /**
     * 功能描述: <br>
     *〈递归写法〉
     *
     * @param：target
     * @return: int
     * @since: 1.0.0
     * @Author: 一个鲁肃
     * @Date: 2018/7/31 14:19
     */
    public int method1(int target){
        if (target <= 0){
            return -1;
        }
        if (target == 1){
            return 1;
        }else {
            return 2*method1(target - 1);
        }
    }

    /**
     * 功能描述: <br>
     *〈非递归写法〉
     *
     * @param：target
     * @return: int
     * @since: 1.0.0
     * @Author: 一个鲁肃
     * @Date: 2018/7/31 14:19
     */
    public int method2(int target){
        int count = 1;
        while (--target > 0){
            count *= 2;
        }
        return count;
    }

    /**
     * 功能描述: <br>
     *〈牛逼解法〉
     *
     * @param：target
     * @return: int
     * @since: 1.0.0
     * @Author: 一个鲁肃
     * @Date: 2018/7/31 14:19
     */
    public int method3(int target){
        return 1 << --target;
    }

}
