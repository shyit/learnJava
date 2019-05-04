package net.htwater.algorithm.tree;

/**
 * Created by cambrian on 2019/5/4.
 */
public class ArrayBinaryTree {
    int[] data;

    public ArrayBinaryTree(int[] data) {
        this.data = data;
    }

    //前序遍历
    public void frontShow(int start) {

        if (data == null || data.length == 0) {
            return;
        }

        System.out.print(data[start]);

        if (start * 2 + 1 < data.length) {
            frontShow(start * 2 + 1);
        }

        if (start * 2 + 2 < data.length) {
            frontShow(start * 2 + 2);
        }

    }

    //前序遍历 默认0
    public void frontShow() {
        frontShow(0);
    }
}
