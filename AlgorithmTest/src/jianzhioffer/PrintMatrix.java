package jianzhioffer;


import java.util.ArrayList;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author FuJianXin
 * @create 2018/9/19
 * @since 1.0.0
 */
public class PrintMatrix {

    /**
     * 存储结果集
     */
    private static ArrayList<Integer> list = new ArrayList<>();

    public static ArrayList<Integer> printMatrix(int[][] matrix) {
        int rowA = 0;
        int colA = 0;
        int rowB = matrix.length - 1;
        int colB = matrix[0].length - 1;
        while (rowB >= rowA && colB >= colA) {
            //直到每一圈都打印完
            print(matrix, rowA++, colA++, rowB--, colB--);
        }
        return list;
    }

    /**
     * 打印方法
     */
    public static void print(int[][] matrix, int rowA, int colA, int rowB, int colB) {
        //如果矩阵是一横行
        if (rowA == rowB) {
            for (int i = colA; i <= colB; i++) {
                list.add(matrix[rowA][i]);
            }
            //如果矩阵是一竖列
        } else if (colA == colB) {
            for (int i = rowA; i <= rowB; i++) {
                list.add(matrix[i][colA]);
            }
            //一般情况
        } else {
            int cur1 = rowA;
            int cur2 = colA;
            while (cur2 != colB) {
                list.add(matrix[rowA][cur2]);
                cur2++;
            }
            while (cur1 != rowB) {
                list.add(matrix[cur1][colB]);
                cur1++;
            }
            while (cur2 != colA) {
                list.add(matrix[rowB][cur2]);
                cur2--;
            }
            while (cur1 != rowA) {
                list.add(matrix[cur1][colA]);
                cur1--;
            }
        }
    }

}