package net.htwater.algorithm.treesecond;

public class ArrayBinaryTree {
    int[] data;

    public ArrayBinaryTree(int[] data) {
        this.data = data;
    }

    //前序遍历
    public void frontShow() {
        frontShow(0);
    }

    //前序遍历
    public void frontShow(int start) {
        System.out.print(data[start]+" ");

        if (start*2+1 < data.length) {
            frontShow(start*2+1);
        }

        if (start*2+2 < data.length) {
            frontShow(start*2+2);
        }
    }
}
