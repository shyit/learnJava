package net.htwater.algorithm.tree;

/**
 * Created by 96955 on 2019/4/27.
 */
public class TreeNode {

    //节点的权
    int value;
    //左节点
    private TreeNode leftNode;
    //右节点
    private TreeNode rightNode;

    public TreeNode(int value) {
        this.value = value;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public void frontShow() {
        System.out.print(value + "  ");

        if (leftNode != null) {
            leftNode.frontShow();
        }

        if (rightNode != null) {
            rightNode.frontShow();
        }
    }

    public void afterShow() {
        if (leftNode != null) {
            leftNode.afterShow();
        }

        if (rightNode != null) {
            rightNode.afterShow();
        }

        System.out.print(value + "  ");
    }

    public void middleShow() {
        if (leftNode != null) {
            leftNode.middleShow();
        }

        System.out.print(value + "  ");

        if (rightNode != null) {
            rightNode.middleShow();
        }
    }

}
