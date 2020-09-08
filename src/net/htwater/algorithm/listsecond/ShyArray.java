package net.htwater.algorithm.listsecond;

public class ShyArray {
    int[] arr;

    public ShyArray() {
        this.arr = new int[0];
    }

    //展示数组
    public void show() {
        System.out.print("[");
        for (int i = 0; i < arr.length - 1; i++) {
            System.out.print(arr[i] + ", ");
        }

        if (arr.length >= 1) {
            System.out.print(arr[arr.length - 1]);
        }
        System.out.print("]");

        System.out.println();
    }

    //添加数组
    public void add(int value) {
        int[] arrTemp = new int[arr.length + 1];
        for (int i = 0; i < arrTemp.length - 1; i++) {
            arrTemp[i] = arr[i];
        }

        arrTemp[arrTemp.length - 1] = value;

        arr = arrTemp;
    }

    //删除元素
    public void delete(int index) {
        if (index < 0 || index >= arr.length) {
            throw new RuntimeException("下标越界");
        }

        int[] arrTemp = new int[arr.length - 1];
        for (int i = 0; i < arrTemp.length; i++) {
            if (i < index) {
                arrTemp[i] = arr[i];
            } else if (i >= index) {
                arrTemp[i] = arr[i + 1];
            }
        }

        arr = arrTemp;
    }

    //插入元素
    public void insert(int index, int value) {
        if (index < 0 || index >= arr.length) {
            throw new RuntimeException("下标越界");
        }

        int[] arrTemp = new int[arr.length + 1];
        for (int i = 0; i < arrTemp.length; i++) {
            if (i < index) {
                arrTemp[i] = arr[i];
            } else if (i == index) {
                arrTemp[i] = value;
            } else if (i > index) {
                arrTemp[i] = arr[i - 1];
            }
        }

        arr = arrTemp;
    }

    //线性查找
    public int search(int target) {
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                index = i;
                break;
            }
        }

        return index;
    }

    //二分法查找
    public int binarySearch(int target) {
        int index = -1;
        int start = 0;
        int end = arr.length;
        int middle;

        while (true) {
            middle = (start + end) / 2;


            if (target == arr[middle]) {
                index = middle;
                break;
            }

            if (target < arr[middle]) {
                end = middle - 1;
            } else if (target > arr[middle]) {
                start = middle + 1;
            }

            if (start > end) {
                break;
            }

        }

        return index;
    }

}
