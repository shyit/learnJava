package net.htwater.leetcode;

/**
 * 类  名: LeetcodeNo104
 * 描  述: LeetcodeNo104. 二叉树的最大深度
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-04-17 14:30
 */
public class LeetcodeNo104 {
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

        int depth = maxDepth(treeNode1);

        // 3
        System.out.println(depth);
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        // 左子树深度
        int depthLeft = maxDepth(root.left);
        // 右子树深度
        int depthRight = maxDepth(root.right);

        // 返回深度大的+1
        if (depthLeft > depthRight) {
            return depthLeft + 1;
        } else {
            return depthRight + 1;
        }

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
