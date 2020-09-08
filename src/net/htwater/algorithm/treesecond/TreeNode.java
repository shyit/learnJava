package net.htwater.algorithm.treesecond;

public class TreeNode {
    int value;

    private TreeNode leftNode;

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

    //前序遍历
    public void frontShow() {
        System.out.print(value+" ");

        if (leftNode != null) {
            leftNode.frontShow();
        }

        if (rightNode != null) {
            rightNode.frontShow();
        }
    }

    //中序遍历
    public void middleShow() {
        if (leftNode != null) {
            leftNode.middleShow();
        }

        System.out.print(value+" ");

        if (rightNode != null) {
            rightNode.middleShow();
        }
    }

    //后序遍历
    public void behindShow() {
        if (leftNode != null) {
            leftNode.behindShow();
        }

        if (rightNode != null) {
            rightNode.behindShow();
        }

        System.out.print(value+" ");
    }

    //前序查找
    public TreeNode frontSearch(int i) {

        TreeNode targetNode = null;
        if (i==value){
            return this;
        }

        if (leftNode != null) {
            targetNode= leftNode.frontSearch(i);
        }
        if (targetNode!=null){
            return targetNode;
        }

        if (rightNode != null) {
            targetNode= rightNode.frontSearch(i);
        }
        if (targetNode!=null){
            return targetNode;
        }

        return null;
    }

    //前序删除
    public void frontDelete(int i) {

        if (this.leftNode != null) {
            if (this.leftNode.value==i) {
                this.leftNode=null;
            }else {
                this.leftNode.frontDelete(i);
            }
        }

        if (this.rightNode != null) {
            if (this.rightNode.value==i) {
                this.rightNode=null;
            }else {
                this.rightNode.frontDelete(i);
            }
        }
    }
}
