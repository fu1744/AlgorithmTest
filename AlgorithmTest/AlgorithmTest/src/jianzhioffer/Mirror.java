package jianzhioffer;

import java.util.Stack;

/**
 *〈一句话功能简述〉<br>
 *〈二叉树的镜像〉
 *
 * @author 一个鲁肃
 * @create 2018/7/30
 * @since 1.0.0
 */
public class Mirror {

    /**
     * 功能描述: <br>
     *〈将给定的二叉树转换成它的镜像树〉
     *
     * @param：root 根节点
     * @since: 1.0.0
     * @Author: 一个鲁肃
     * @Date: 2018/8/13 18:37
     */
    public void mirror(TreeNode root) {
        //代码的鲁棒性
        if (root == null){
            return;
        }
        //case
        if (root.left == null && root.right == null){
            return;
        }
        //swap
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        //子节点继续进行判断
        if (root.left != null){
            mirror(root.left);
        }
        if (root.right != null){
            mirror(root.right);
        }
    }

    /**
     * 额外空间栈
     * @param root 根节点
     */
    public void mirror1(TreeNode root){
        //代码的鲁棒性
        if (root == null){
            return;
        }
        //额外空间栈
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            if (node.left != null || node.right != null){
                TreeNode temp = node.left;
                node.left = node.right;
                node.right = temp;
            }
            if (root.left != null){
                stack.push(root.left);
            }
            if (root.left != null){
                stack.push(root.left);
            }
        }
    }



}
