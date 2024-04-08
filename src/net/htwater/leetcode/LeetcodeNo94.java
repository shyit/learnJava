package net.htwater.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 类  名: LeetcodeNo94
 * 描  述: LeetcodeNo94. 二叉树的中序遍历
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-04-07 22:22
 */
public class LeetcodeNo94 {

    // 给定一个二叉树的根节点 root ，返回 它的 中序 遍历 。
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);

        treeNode1.right = treeNode2;
        treeNode2.left = treeNode3;

        List<Integer> intList = inorderTraversal2(treeNode1);

        // 1 3 2
        intList.forEach(item -> System.out.println(item));
    }

    // 递归法
    public static List<Integer> inorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> intList = new ArrayList<>();

        // 左子树
        List<Integer> intListLeft = inorderTraversal(root.left);
        intList.addAll(intListLeft);
        // 双亲节点
        intList.add(root.val);
        // 右子树
        List<Integer> intListRight = inorderTraversal(root.right);
        intList.addAll(intListRight);

        return intList;
    }

    // 迭代法
    public static List<Integer> inorderTraversal2(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> intList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode treeNodeCurrent = root;

        while (treeNodeCurrent != null || !stack.isEmpty()) {
            // 遍历当前节点及其所有 左孩子
            while (treeNodeCurrent != null) {
                stack.push(treeNodeCurrent);
                treeNodeCurrent = treeNodeCurrent.left;
            }

            // 栈中取出元素
            treeNodeCurrent = stack.pop();

            // 赋值为 右孩子
            intList.add(treeNodeCurrent.val);
            treeNodeCurrent = treeNodeCurrent.right;
        }


        return intList;
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
