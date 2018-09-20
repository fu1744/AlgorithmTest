package jianzhioffer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 *〈一句话功能简述〉<br>
 *〈TopK问题〉
 * 题目描述：
 * 输入n个整数，找出其中最小的K个数。例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 *
 * @author 一个鲁肃
 * @create 2018/8/24
 * @since 1.0.0
 */
public class TopK {


    /**
     * 功能描述: <br>
     *〈获取最小的k个数〉
     *
     *
     * @param：input k
     * @return:
     * @since: 1.0.0
     * @Author: 一个鲁肃
     * @Date: 2018/8/24 18:34
     */
    public ArrayList<Integer> getLeastNumbersForSolution1(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (input == null || input.length <= 0 || k<=0 || input.length < k){
            return list;
        }
        int start = 0;
        int end = input.length-1;
        int index = partition(input,start,end);
        while (index != (k-1)){
            if (index > k-1){
                end = index -1;
                index = partition(input,start,end);
            }else {
                start = index+1;
                index = partition(input,start,end);
            }
        }
        for(int i=0;i<k;++i){
            list.add(input[i]);
        }
        return list;

    }


    /**
     * 功能描述: <br>
     *〈快速排序的核心函数partition〉
     *
     * @param：arr l r
     * @return:
     * @since: 1.0.0
     * @Author: 一个鲁肃
     * @Date: 2018/8/24 18:44
     */
    private static int partition(int[] arr, int l, int r) {
        int less = l - 1;
        int more = r;
        while (l < more) {
            if (arr[l] < arr[r]) {
                swap(arr, ++less, l++);
            } else if (arr[l] > arr[r]) {
                swap(arr, --more, l);
            } else {
                l++;
            }
        }
        //最后将最大区的最后一个数换到最大区的第一个数
        swap(arr, more, r);
        return less+1;
    }


    /**
     * 功能描述: <br>
     *〈交换位置的方法〉
     *
     * @param：arr i j
     * @return:
     * @since: 1.0.0
     * @Author: 一个鲁肃
     */
    private static void swap(int[] arr, int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }



    /**
     * 功能描述: <br>
     *〈利用堆结构〉
     *
     * @param：input k
     * @return:
     * @since: 1.0.0
     * @Author: 一个鲁肃
     * @Date: 2018/9/6 23:16
     */
    public ArrayList<Integer> getLeastNumbersForSolution2(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (input == null || input.length <= 0 || k<=0 || input.length < k){
            return list;
        }
        Queue<Integer> heap = new PriorityQueue<>(k, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        for (int i = 0;i < input.length;i++){
            if (heap.size() < k){
                heap.add(input[i]);
            }else {
                if (input[i] < heap.peek()){
                    heap.remove();
                    heap.add(input[i]);
                }
            }
        }
        while (!heap.isEmpty()){
            list.add(heap.remove());
        }
        return list;

    }


    /**
     * 功能描述: <br>
     *〈冒泡排序思想〉
     *
     * @param：input k
     * @return:
     * @since: 1.0.0
     * @Author: 一个鲁肃
     * @Date: 2018/9/6 23:17
     */
    public ArrayList<Integer> getLeastNumbersForSolution3(int [] input, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        if (input == null || input.length <= 0 || k<=0 || input.length < k){
            return list;
        }
        for (int i = 0; i < k; i++){
            for (int j = 0; j < input.length-i-1;j++){
                if (input[j] < input[j + 1]) {
                    swap(input,j,j+1);
                }
            }
            list.add(input[input.length-i-1]);
        }
        return list;
    }


}
