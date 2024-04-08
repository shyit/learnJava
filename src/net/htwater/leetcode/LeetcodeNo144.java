package net.htwater.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 类  名: LeetcodeNo144
 * 描  述: LeetcodeNo144. 二叉树的前序遍历
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-04-08 12:20
 */
public class LeetcodeNo144 {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);

        treeNode1.right = treeNode2;
        treeNode2.left = treeNode3;

        List<Integer> intList = preorderTraversal2(treeNode1);

        // 1 2 3
        intList.forEach(item -> System.out.println(item));
    }

    // 递归法
    public static List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> intList = new ArrayList<>();

        // 当前节点
        intList.add(root.val);

        // 左子树
        List<Integer> integerListLeft = preorderTraversal(root.left);
        intList.addAll(integerListLeft);

        // 右子树
        List<Integer> integerListRight = preorderTraversal(root.right);
        intList.addAll(integerListRight);

        return intList;
    }

    // 迭代法
    public static List<Integer> preorderTraversal2(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        //
        List<Integer> intList = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        TreeNode treeNodeCurrent = root;
        while (treeNodeCurrent != null || !stack.isEmpty()) {
            while (treeNodeCurrent != null) {
                intList.add(treeNodeCurrent.val);
                stack.push(treeNodeCurrent);
                treeNodeCurrent = treeNodeCurrent.left;
            }

            treeNodeCurrent = stack.pop().right;
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
