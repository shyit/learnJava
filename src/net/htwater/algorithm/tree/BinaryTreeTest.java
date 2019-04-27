package net.htwater.algorithm.tree;

/**
 * Created by 96955 on 2019/4/27.
 */
public class BinaryTreeTest {

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();

        TreeNode root = new TreeNode(1);
        binaryTree.setRoot(root);

        TreeNode rootleft = new TreeNode(2);
        root.setLeftNode(rootleft);

        TreeNode rootRight = new TreeNode(3);
        root.setRightNode(rootRight);

        rootleft.setLeftNode(new TreeNode(4));
        rootleft.setRightNode(new TreeNode(5));

        rootRight.setLeftNode(new TreeNode(6));
        rootRight.setRightNode(new TreeNode(7));

//        binaryTree.frontShow();
//        System.out.println();
//        binaryTree.middleShow();
//        System.out.println();
//        binaryTree.afterShow();
//
//        TreeNode resultTreeNode=binaryTree.frontSearch(3);
//
//        System.out.println(resultTreeNode==rootRight);

        binaryTree.frontShow();
        binaryTree.delete(1);
        System.out.println();
        binaryTree.frontShow();
    }

}
