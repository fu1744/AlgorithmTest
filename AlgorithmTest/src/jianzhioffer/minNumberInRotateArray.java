package jianzhioffer;

/**
 *〈一句话功能简述〉<br>
 *〈旋转数组的最小数〉
 * 题目描述：
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 *
 * @author 一个鲁肃
 * @create 2018/7/26
 * @since 1.0.0
 */
public class minNumberInRotateArray {

    public int method1(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int left = 0;
        int right = array.length - 1;
        int mid = 0;
        while (array[left] >= array[right]) {
            if (right - left == 1) {
                mid = right;
                break;
            }
            mid = left + (right - left) / 2;
            //如果出现都相等的情况
            if (array[left] == array[mid] && array[mid] == array[right]) {
                return find(array, left, right);
            }
            if (array[mid] >= array[left]) {
                left = mid;
            }
            if (array[mid] <= array[right]) {
                right = mid;
            }
        }
        return array[mid];
    }


    /**
     * 功能描述: <br>
     * 〈此时需要从头到尾进行查找〉
     *
     * @param：arr index1 index2
     * @return:
     * @since: 1.0.0
     * @Author: 一个鲁肃
     * @Date: 2018/7/26 0:43
     */
    public int find(int[] arr, int index1, int index2) {
        int result = arr[index1];
        for (int i = index1 + 1; i <= index2; i++) {
            if (arr[i] < result) {
                result = arr[i];
            }
        }
        return result;
    }


    /**
     * 功能描述: <br>
     *〈解法二〉
     *
     * @param：array
     * @return:
     * @since: 1.0.0
     * @Author: 一个鲁肃
     * @Date: 2018/7/26 0:45
     */
    public int method2(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return array[i + 1];
            }
        }
        return array[0];
    }

}
