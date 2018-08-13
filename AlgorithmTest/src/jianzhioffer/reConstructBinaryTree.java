package jianzhioffer;

/**
 * 〈一句话功能简述〉<br>
 * 〈重建二叉树〉
 *
 * @author 一个鲁肃
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
