/**
 * Copyright (C), 2018, 宜信
 * FileName: NumberOf1
 * Author:   Administrator
 * Date:     2018/7/5 16:59
 * Description: 二进制数中1的个数
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package JianZhiOffer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二进制数中1的个数〉
 *
 * @author Fujianxin
 * @create 2018/7/5
 * @since 1.0.0
 */

public class NumberOf1 {

    /**
     * 功能描述: <br>
     * 〈该函数计算二进制数中1的个数〉
     * @return:int
     * @since: 1.0.0
     * @Author:Fujianxin
     * @Date: 2018/7/5 18:29
     */
    public int method1(int num) {
        int count = 0;
        while(num != 0){
            if((num & 1) == 1){
                count++;
            }
            num = num >> 1;
        }
        return count;

    }

    /**
     * 功能描述: <br>
     * 〈该函数计算二进制数中1的个数〉
     * @return:int
     * @since: 1.0.0
     * @Author:Fujianxin
     * @Date: 2018/7/5 18:29
     */
    public int method2(int num) {
        int count = 0;
        int flag = 1;
        while (flag != 0){
            if ((num & flag) == 1){
                count++;
            }
            flag = flag << 1;
        }
        return count;

    }

    /**
     * 功能描述: <br>
     * 〈该函数计算二进制数中1的个数〉
     * @return:int
     * @since: 1.0.0
     * @Author:Fujianxin
     * @Date: 2018/7/5 18:29
     */
    public int method3(int num) {
        int count = 0;
        while (num != 0){
            count++;
            num = num & (num-1);
        }
        return count;

    }

}
