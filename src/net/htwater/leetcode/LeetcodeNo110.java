package net.htwater.leetcode;

/**
 * 类  名: LeetcodeNo110
 * 描  述: LeetcodeNo110. 平衡二叉树
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-04-17 16:30
 */
public class LeetcodeNo110 {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(3);
        TreeNode treeNode2 = new TreeNode(9);
        TreeNode treeNode3 = new TreeNode(20);
        TreeNode treeNode4 = new TreeNode(15);
        TreeNode treeNode5 = new TreeNode(7);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode3.left = treeNode4;
        treeNode3.right = treeNode5;

        boolean flagBoolean = isBalanced(treeNode1);

        // true
        System.out.println(flagBoolean);
    }

    public static boolean isBalanced(TreeNode root) {
        int height = height(root);
        return height > -1;
    }

    public static int height(TreeNode treeNode) {
        if (treeNode == null) {
            return 0;
        }

        // 左子树高度
        int heightLeft = height(treeNode.left);
        // 右子树高度
        int heightRight = height(treeNode.right);

        // 不平衡返回-1
        if (heightLeft == -1 || heightRight == -1 || (Math.abs(heightLeft - heightRight)) > 1) {
            return -1;
        }

        return Math.max(heightLeft, heightRight) + 1;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
