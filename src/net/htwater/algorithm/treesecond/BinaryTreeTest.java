package net.htwater.algorithm.treesecond;

public class BinaryTreeTest {
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);

        BinaryTree binaryTree=new BinaryTree(root);

        TreeNode rootLeft=new TreeNode(2);
        TreeNode rootRight=new TreeNode(3);

        root.setRightNode(rootRight);
        root.setLeftNode(rootLeft);

        rootLeft.setLeftNode(new TreeNode(4));
        rootLeft.setRightNode(new TreeNode(5));
        rootRight.setLeftNode(new TreeNode(6));
        rootRight.setRightNode(new TreeNode(7));

        binaryTree.frontShow();

        System.out.println();

        binaryTree.frontDelete(2);

        binaryTree.frontShow();

        System.out.println();
    }
}
