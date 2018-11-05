package jianzhioffer;

/**
 *〈一句话功能简述〉<br>
 *〈二维数组中的查找〉
 * 题目描述：
 * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 *
 * @author 一个鲁肃
 * @create 2018/7/26
 * @since 1.0.0
 */
public class Find {

    public boolean method(int target, int [][] array) {
        //此处注意代码的鲁棒性
        if(array.length == 0){
            return false;
        }
        int low = 0;
        int high = array[0].length - 1;
        while(low < array.length
                && high > -1){
                //循环的终止条件，防止索引越界
            if(target == array[low][high]){
                return true;
            }else if(target > array[low][high]){
                low++;
            }else {
                high--;
            }
        }
        return false;
    }

}
