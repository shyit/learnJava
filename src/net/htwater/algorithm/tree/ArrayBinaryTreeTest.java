package net.htwater.algorithm.tree;

/**
 * Created by cambrian on 2019/5/4.
 */
public class ArrayBinaryTreeTest {

    public static void main(String[] args) {
        int[] data=new int[]{1,2,3,4,5,6,7,8,9};
        ArrayBinaryTree arrayBinaryTree=new ArrayBinaryTree(data);
        arrayBinaryTree.frontShow();
    }
}
