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

    public TreeNode frontSearch(int i) {
        TreeNode resultTreeNode = null;

        if (value == i) {
            return this;
        }

        if (leftNode != null) {
            resultTreeNode = leftNode.frontSearch(i);
        }
        if (resultTreeNode != null) {
            return resultTreeNode;
        }
        if (rightNode != null) {
            resultTreeNode = rightNode.frontSearch(i);
        }
        if (resultTreeNode != null) {
            return resultTreeNode;
        }

        return resultTreeNode;
    }

    public void delete(int i) {

        if (leftNode != null) {
            if (leftNode.value == i) {
                leftNode = null;
            } else {
                leftNode.delete(i);
            }

        }

        if (rightNode != null) {
            if (rightNode.value == i) {
                rightNode = null;
            } else {
                rightNode.delete(i);
            }

        }

    }
}
