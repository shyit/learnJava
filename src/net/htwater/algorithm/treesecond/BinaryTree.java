package net.htwater.algorithm.treesecond;

public class BinaryTree {
    private TreeNode root;

    public BinaryTree(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    //前序遍历
    public void frontShow(){
        root.frontShow();
    }

    //中序遍历
    public void middleShow(){
        root.middleShow();
    }

    //后序遍历
    public void behindShow() {
        root.behindShow();
    }

    //前序查找
    public TreeNode frontSearch(int i) {
        return root.frontSearch(i);
    }

    public void frontDelete(int i) {
        if (root.value==i){
            root=null;
        }else {
            root.frontDelete(i);
        }
    }
}
