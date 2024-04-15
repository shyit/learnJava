package net.htwater.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 类  名: LeetcodeNo145
 * 描  述: LeetcodeNo145. 二叉树的后序遍历
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-04-08 15:08
 */
public class LeetcodeNo145 {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);

        treeNode1.right = treeNode2;
        treeNode2.left = treeNode3;

        List<Integer> intList = postorderTraversal2(treeNode1);

        // 3 2 1
        intList.forEach(item -> System.out.println(item));
    }


    public static List<Integer> postorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        List<Integer> intList = new ArrayList<>();

        // 左子树
        List<Integer> integerListLeft = postorderTraversal(root.left);
        intList.addAll(integerListLeft);

        // 右子树
        List<Integer> integerListRight = postorderTraversal(root.right);
        intList.addAll(integerListRight);

        // 当前节点
        intList.add(root.val);

        return intList;
    }


    public static List<Integer> postorderTraversal2(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }

        Stack<TreeNode> stack = new Stack<>();
        List<Integer> intList = new ArrayList<>();
        TreeNode treeNodeNow = root;
        TreeNode treeNodePre = treeNodeNow;

        while (treeNodeNow != null || !stack.isEmpty()) {
            while (treeNodeNow != null) {
                stack.push(treeNodeNow);
                treeNodeNow = treeNodeNow.left;
            }

            treeNodeNow = stack.peek();

            // 如果当前节点的右节点为null 或者右节点已经访问过 取出当前节点
            if (treeNodeNow.right == null || treeNodePre == treeNodeNow.right) {
                treeNodePre = treeNodeNow;
                treeNodeNow = stack.pop();
                intList.add(treeNodeNow.val);
                // 设置为null 跳过 循环
                treeNodeNow = null;
            } else {
                treeNodeNow = stack.peek().right;
            }

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
