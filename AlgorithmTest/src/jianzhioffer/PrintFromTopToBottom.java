package jianzhioffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *〈一句话功能简述〉<br>
 *〈从上往下打印二叉树〉
 * 题目描述：
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 *
 * @author 一个鲁肃
 * @create 2018/8/14
 * @since 1.0.0
 */
public class PrintFromTopToBottom {

    public ArrayList<Integer> printFromTopToBottom(TreeNode root) {
        if (root == null){
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode cur;
        while (!queue.isEmpty()){
            cur = queue.poll();
            list.add(cur.val);
            if (cur.left != null){
                queue.add(cur.left);
            }
            if (cur.right != null){
                queue.add(cur.right);
            }
        }
        return list;
    }

}
