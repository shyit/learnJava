package net.htwater.algorithm.list;

import java.util.Arrays;

/**
 * Created by cambrian on 2019/4/11.
 */
public class MyArray {
    private int[] elements;

    public MyArray() {
        elements = new int[0];
    }

    public int size() {
        return elements.length;
    }

    public void add(int element) {
        int[] newArray = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
        newArray[newArray.length - 1] = element;

        elements = newArray;
    }

    public void remove(int index) {
        if (index < 0 || index > elements.length - 1) {
            throw new RuntimeException("下标越界");
        }

        int[] newArray = new int[elements.length - 1];
        for (int i = 0; i < elements.length - 1; i++) {
            if (i < index) {
                newArray[i] = elements[i];
            } else {
                newArray[i] = elements[i + 1];
            }
        }

        elements = newArray;

    }

    public void insert(int index, int value) {
        int[] newArray = new int[elements.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = elements[i];
            } else if (i == index) {
                newArray[i] = value;
            } else {
                newArray[i] = elements[i - 1];
            }
        }
        elements = newArray;
    }

    public int get(int index) {
        return elements[index];
    }

    public int search(int target) {
        int index = -1;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == target) {
                index = i;
                break;
            }
        }

        return index;
    }

    public int binarySearch(int target) {
        int index = -1;

        int begin = 0;
        int end = elements.length - 1;
        int middle = 0;

        while (begin <= end) {
            middle = (begin + end) / 2;
            if (elements[middle] < target) {
                begin = middle + 1;
            } else if (elements[middle] == target) {
                index = middle;
                break;
            } else {
                end = middle - 1;
            }
        }

        return index;
    }

    public void show() {
        System.out.println(Arrays.toString(elements));
    }


}
