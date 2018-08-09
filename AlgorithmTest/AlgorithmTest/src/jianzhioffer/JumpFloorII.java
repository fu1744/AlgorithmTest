package jianzhioffer;

/**
 *〈一句话功能简述〉<br>
 *〈变态跳台阶〉
 *
 * @author FuJianXin
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
     * @Author:FuJianXin
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
     * @Author:FuJianXin
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
     * @Author:FuJianXin
     * @Date: 2018/7/31 14:19
     */
    public int method3(int target){
        return 1 << --target;
    }

}
