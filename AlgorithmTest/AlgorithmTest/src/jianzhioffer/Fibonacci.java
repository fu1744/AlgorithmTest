package jianzhioffer;

/**
 * 〈一句话功能简述〉<br>
 * 〈斐波那契数列〉
 *
 * @author 一个鲁肃
 * @create 2018/7/26
 * @since 1.0.0
 */
public class Fibonacci {

    public int metho1(int n) {
        //代码的鲁棒性
        if (n <= 1) {
            return n;
        }
        int[] arr = new int[n + 1];
        arr[0] = 0;
        arr[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        return arr[n];
    }

    public int method2(int n) {
        //代码的鲁棒性
        if (n <= 1) {
            return n;
        }
        int first = 0;
        int second = 1;
        int result = 0;
        for (int i = 2; i < n + 1; i++) {
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

}
