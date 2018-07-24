/**
 * Copyright (C), 2018, 宜信
 * FileName: Power
 * Author:   FuJianXin
 * Date:     2018/7/13 17:54
 * Description: 计算数值的整数次方
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package JianZhiOffer;

/**
 *〈一句话功能简述〉<br>
 *〈计算数值的整数次方〉
 *
 * @author FuJianXin
 * @create 2018/7/13
 * @since 1.0.0
 */

public class Power {

    /**
     * 功能描述: <br>
     *〈利用快速幂解法，时间复杂度为O(logn)〉
     *
     * @param：base exponent
     * @return: double
     * @since: 1.0.0
     * @Author:FuJianXin
     * @Date: 2018/7/24 0:50
     */
    public double method1(double base, int exponent){
        int n = Math.abs(exponent);
        if (n == 0){
            return 1;
        }
        if (n == 1){
            return base;
        }
        double result = 1.0;
        while (n != 0){
            if ((n & 1) == 1){
                result *= base;
            }
            //将基数累成
            base *= base;
            n >>= 1;
        }
        return exponent > 0 ? result : (1/result);
    }

    /**
     * 功能描述: <br>
     *〈时间复杂度为O(n)的解法〉
     *
     * @param：base exponent
     * @return: double
     * @since: 1.0.0
     * @Author:FuJianXin
     * @Date: 2018/7/24 0:56
     */
    public double method2(double base, int exponent){
        //代码鲁棒性
        if (exponent == 0){
            return 1;
        }
        if (exponent == 1){
            return base;
        }

        double result = 1.0;
        for (int i = 1;i <= Math.abs(exponent);i++){
            result *= base;
        }
        return exponent > 0 ? result : (1/result);
    }

}
