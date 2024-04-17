package net.htwater.leetcode;

import net.htwater.think.D11.D11_05.Stack;

/**
 * 类  名: LeetcodeNo101
 * 描  述: LeetcodeNo101. 对称二叉树
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-04-17 09:54
 */
public class LeetcodeNo101 {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(2);
        TreeNode treeNode4 = new TreeNode(3);
        TreeNode treeNode5 = new TreeNode(4);
        TreeNode treeNode6 = new TreeNode(4);
        TreeNode treeNode7 = new TreeNode(3);

        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;

        boolean flagBoolean = isSymmetric(treeNode1);

        // true
        System.out.println(flagBoolean);
    }

    public static boolean isSymmetric(TreeNode root) {
        return isMirror(root.left, root.right);
    }

    public static boolean isMirror(TreeNode left, TreeNode right) {
        // 判断是否都是 null
        if (left == null && right == null) {
            return true;
        }

        // 判断是否只有一个是null
        if (left == null || right == null) {
            return false;
        }

        // 判断自身和子节点是否都相等
        return left.val == right.val && isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    public static boolean isMirror2(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root.left);
        stack.push(root.right);
        while (!stack.empty()) {
            // 取出最后的两个节点
            TreeNode right = stack.pop();
            TreeNode left = stack.pop();

            if (right == null && left == null) {
                continue;
            }

            if (right == null || left == null) {
                return false;
            }

            if (left.val != right.val) {
                return false;
            }

            // 两个节点的左右子节点都加入栈中
            stack.push(left.left);
            stack.push(right.right);
            stack.push(left.right);
            stack.push(right.left);
        }

        return true;
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
