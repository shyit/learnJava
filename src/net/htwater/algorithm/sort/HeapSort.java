package net.htwater.algorithm.sort;

import java.util.Arrays;

/**
 * Created by 96955 on 2019/5/15.
 */
public class HeapSort {
    public static void main(String[] args) {
        int[] arr = new int[]{9, 6, 8, 7, 0, 1, 10, 4, 2};

        heapSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    //把数组转换成最大堆积，
    //重复从最大堆积取出数值最大的结点，(把根节点和最后一个结点交换，吧交换狗的最后一个节点移出堆)
    //让残余的堆积位置最大堆积性质
    public static void heapSort(int[] arr) {
        int start = (arr.length - 2) / 2;
        for (int i = start; i >= 0; i--) {
            maxHeap(arr, arr.length, i);
        }

        for (int i = arr.length - 1; i > 0; i--) {
            System.out.println(Arrays.toString(arr));

            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            maxHeap(arr, i, 0);
        }
    }

    public static void maxHeap(int[] arr, int size, int index) {
        int leftNode = 2 * index + 1;
        int rightNode = 2 * index + 2;
        int max = index;
        if ((leftNode < size) && (arr[leftNode] > arr[max])) {
            max = leftNode;
        }
        if ((rightNode < size) && (arr[rightNode] > arr[max])) {
            max = rightNode;
        }
        if (max != index) {
            int temp = arr[index];
            arr[index] = arr[max];
            arr[max] = temp;
            maxHeap(arr, size, max);
        }

    }
}
