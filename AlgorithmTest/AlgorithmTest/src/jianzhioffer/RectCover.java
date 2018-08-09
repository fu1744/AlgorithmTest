package jianzhioffer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 *   请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？〉
 *
 *  @author FuJianXin
 *  @create 2018/7/20
 *  @since 1.0.0
 */
public class RectCover {

    /**
     * 功能描述: <br>
     *〈计算出矩形覆盖共有多少中方法〉
     *
     * @param：target
     * @return: int
     * @since: 1.0.0
     * @Author:FuJianXin
     * @Date: 2018/7/20 18:27
     */
    public int method(int target){
        if (target < 1){
            return 0;
        }
        if (target == 1){
            return 1;
        }
        if (target == 2){
            return 2;
        }
        return method(target-1)+method(target-2);

    }

}
