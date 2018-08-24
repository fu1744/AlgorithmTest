package jianzhioffer;

/**
 *〈一句话功能简述〉<br>
 *〈二叉搜索树的后序遍历〉
 *〈输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。
 * 如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。〉
 *
 * @author 一个鲁肃
 * @create 2018/8/14
 * @since 1.0.0
 */
public class VerifySquenceOfBST {

    /**
     * 功能描述: <br>
     *〈非递归版本〉
     *
     * @param：sequence
     * @return: boolean
     */
    public boolean verifySquenceOfBST1(int [] sequence) {
        //TODO
        int size = sequence.length;
        if (size == 0){
            return false;
        }
        //定义指针变量
        int i = 0;
        while (--size > 0){
            while (sequence[i] < sequence[size]){
                i++;
            }
            while (sequence[i] > sequence[size]){
                i++;
            }
            if (i < size) {
                return false;
            }
            i = 0;
        }
        return true;
    }

    /**
     * 功能描述: <br>
     *〈递归版本〉
     *
     * @param：sequence
     * @return: boolean
     */
    public boolean verifySquenceOfBST2(int [] sequence) {
        //TODO
        if (sequence == null || sequence.length == 0){
            return false;
        }
        return judge(sequence,0,sequence.length-1);
    }

    public boolean judge(int[] arr,int start,int end){
        if (start >= end){
            return true;
        }
        int index = start;
        while (arr[index] < arr[end]){
            index++;
        }
        for (int i = index;i < end;i++){
            if (arr[i] < arr[end]){
                return false;
            }
        }

        return judge(arr,start,index-1) && judge(arr,index,end-1);
    }

}
