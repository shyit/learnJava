package net.htwater.algorithmmuke.heap;

import java.util.Arrays;
import java.util.Random;

public class HeapSort {

    private HeapSort() {

    }

    public static <E extends Comparable<E>> void sort(E[] data) {
        MaxHeap<E> maxHeap = new MaxHeap<>();

        for (int i = 0; i < data.length; i++) {
            E element = data[i];
            maxHeap.add(element);
        }

        for (int i = 0; i < data.length; i++) {
            data[i] = maxHeap.extractMax();
        }
    }


    public static <E extends Comparable<E>> void sort2(E[] data) {
        for (int i = data.length - 1; i >= 0; i--) {
            siftDown(data, i, data.length);
        }

        for (int i = data.length - 1; i >= 0; i--) {
            E tempElement = data[i];
            data[i] = data[0];
            data[0] = tempElement;

            siftDown(data, 0, i);
        }
    }

    private static <E extends Comparable<E>> void siftDown(E[] data, int k, int n) {
        int size = n;
        int leftIndex = k * 2 + 1;
        int rightIndex = k * 2 + 2;

        int maxIndex = k;
        if (leftIndex < size && data[leftIndex].compareTo(data[maxIndex]) > 0) {
            maxIndex = leftIndex;
        }

        if (rightIndex < size && data[rightIndex].compareTo(data[maxIndex]) > 0) {
            maxIndex = rightIndex;
        }

        if (maxIndex != k) {
            E tempElement = data[k];
            data[k] = data[maxIndex];
            data[maxIndex] = tempElement;
            siftDown(data, maxIndex, n);
        }
    }

    public static void main(String[] args) {
        int count = 10;
        Random random = new Random();

        Integer[] arr = new Integer[count];

        for (int i = 0; i < count; i++) {
            arr[i] = random.nextInt((i + 10) * 2);
        }

        System.out.println(Arrays.toString(arr));

        HeapSort.sort2(arr);

        System.out.println(Arrays.toString(arr));

//        MaxHeap<Integer> maxHeap = new MaxHeap<>();
//
//
//        System.out.println(Arrays.toString(arr));
    }


}
