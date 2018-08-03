package jianzhioffer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈调整数组顺序使奇数位于偶数前面〉
 *
 * @author FuJianXin
 * @create 2018/7/24
 * @since 1.0.0
 */
public class ReOrderArray {

    /**
     * 功能描述: <br>
     *〈使用额外空间的解法，时间复杂度为O(N)，空间复杂度O(N)〉
     *
     * @param：array
     * @return:
     * @since: 1.0.0
     * @Author:FuJianXin
     * @Date: 2018/7/24 18:59
     */
    public void method1(int[] array){
        //注意代码的鲁棒性
        if (array == null || array.length <= 1){
            return;
        }
        //创建而外空间
        int[] result = new int[array.length];
        int index = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 1){
                result[index++] = array[i];
            }
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                result[index++] = array[i];
            }
        }

    }

    /**
     * 功能描述: <br>
     *〈利用冒泡排序的性质，空间复杂度为O(1)，时间复杂度为O(N)〉
     *
     * @param：array
     * @return:
     * @since: 1.0.0
     * @Author:FuJianXin
     * @Date: 2018/7/24 19:09
     */

    public void method2(int[] array){
        //注意代码的鲁棒性
        if (array == null || array.length <= 1){
            return;
        }
        for (int i = 0;i < array.length-1; i++){
            for (int j = 0;j < array.length-1-i;j++){
                if (array[j] % 2 == 0 && array[j+1] % 2 == 1){
                    swap(array,j,j+1);
                }
            }
        }

    }

    /**
     * 功能描述: <br>
     *〈交换位置的方法〉
     *
     * @param：
     * @return:
     * @since: 1.0.0
     * @Author:FuJianXin
     * @Date: 2018/7/24 19:20
     */
    public void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
