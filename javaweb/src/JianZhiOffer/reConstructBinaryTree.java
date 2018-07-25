/**
 * Copyright (C),2018, 宜信
 * FileName: reConstructBinaryTree
 * Author:   FuJianXin
 * Date:     2018/7/26 0:38
 * Description: 重建二叉树
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package JianZhiOffer;

/**
 * 〈一句话功能简述〉<br>
 * 〈重建二叉树〉
 *
 * @author FuJianXin
 * @create 2018/7/26
 * @since 1.0.0
 */
public class reConstructBinaryTree {


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public TreeNode method(int[] pre, int[] in) {
        return resConstructBinaryTree(
                pre, 0, pre.length - 1,
                in, 0, in.length - 1);
    }

    public TreeNode resConstructBinaryTree(int[] pre, int startPre, int endPre,
                                           int[] in, int startIn, int endIn) {
        if (startPre > endPre || startIn > endIn) {
            return null;
        }
        TreeNode node = new TreeNode(pre[startPre]);
        for (int i = startIn; i <= endIn; i++) {
            if (in[i] == pre[startPre]) {
                node.left = resConstructBinaryTree(
                        pre, startPre + 1, startPre + i - startIn,
                        in, startIn, i - 1);
                node.right = resConstructBinaryTree(
                        pre, startPre + i - startIn + 1, endPre,
                        in, i + 1, endIn);
                break;
            }
        }
        return node;
    }
}
