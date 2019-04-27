package net.htwater.algorithm.tree;

/**
 * Created by 96955 on 2019/4/27.
 */
public class BinaryTree {
    TreeNode root;

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public void frontShow(){
        root.frontShow();
    }

    public void middleShow(){
        root.middleShow();
    }

    public void afterShow(){
        root.afterShow();
    }
}
