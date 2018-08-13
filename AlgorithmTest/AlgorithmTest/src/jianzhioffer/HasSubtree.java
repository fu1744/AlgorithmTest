package jianzhioffer;

/**
 * 〈一句话功能简述〉<br> 
 * 〈树的子结构〉
 *
 * @author 一个鲁肃
 * @create 2018/7/27
 * @since 1.0.0
 */
public class HasSubtree {

    private boolean method1(TreeNode root1,TreeNode root2){
        //标记，识别root2是否是root1的子树
        boolean flag = false;
        if (root1 != null && root2 != null){
            //说明根节点匹配
            if (root1.val == root2.val){
                flag = doesTree1HaveTree(root1,root2);
            }
            //根节点不匹配，则继续匹配左子节点
            if (!flag){
                flag = doesTree1HaveTree(root1.left,root2);
            }
            //根节点不匹配，则继续匹配右子节点
            if (!flag){
                flag = doesTree1HaveTree(root1.right,root2);
            }
        }
        return flag;
    }

    private boolean doesTree1HaveTree(TreeNode root1, TreeNode root2){
        //说明root2遍历完了，返回true
        if (root2 == null){
            return true;
        }
        //root遍历完了，root2还没，说明root2不是root1的子树
        if (root1 == null){
            return false;
        }
        //值不匹配返回false
        if (root1.val != root2.val){
            return false;
        }
        //匹配则继续递归左子节点和右子节点
        return doesTree1HaveTree(root1.left,root2.left) && doesTree1HaveTree(root1.right,root2.right);

    }

}

/**
 * 功能描述: <br>
 *〈TreeNode节点类〉
 * @since: 1.0.0
 * @Author: 一个鲁肃
 * @Date: 2018/7/27 18:31
 */
class TreeNode {

    public int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;
    }
}
