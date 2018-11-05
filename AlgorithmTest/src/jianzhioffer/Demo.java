package jianzhioffer;

import java.util.Stack;

/**
 * @author FuJianXin
 * @create 2018/11/5
 */
public class Demo {

    //自定义树结构
    public static class TreeNode {
        int value;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            value = x;
        }
    }

    public static int method(TreeNode treeNode){
        if (treeNode == null){
            return -1;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(treeNode);
        int result = 0;
        StringBuilder cur = null;
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            cur.append(node.value);
            //左右孩子节点都为null
            if (node.left == null && node.right == null){
                //该结点就是叶子节点
                result += Integer.valueOf(cur.toString());
                //清空
                cur.setLength(0);
            }
            if (node.left != null){
                stack.push(node.left);
            }
            if (node.right != null){
                stack.push(node.right);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(7);
        int result = method(treeNode);
        System.out.println(result);
    }

}
