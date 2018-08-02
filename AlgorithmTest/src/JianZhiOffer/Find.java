package JianZhiOffer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈二维数组中的查找〉
 *
 * @author FuJianXin
 * @create 2018/7/26
 * @since 1.0.0
 */
public class Find {

    public boolean method(int target, int [][] array) {
        //此处注意代码的鲁棒性
        if(array.length == 0 || array == null){
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
