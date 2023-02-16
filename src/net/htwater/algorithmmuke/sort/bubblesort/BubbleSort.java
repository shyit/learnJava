package net.htwater.algorithmmuke.sort.bubblesort;

import java.util.Arrays;

public class BubbleSort {
    private BubbleSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        bubbleSort(arr, 1);
    }

    private static <E extends Comparable<E>> void bubbleSort(E[] arr, int sortCount) {
        if (sortCount > arr.length - 1) {
            return;
        }

        for (int i = 0; i < arr.length - sortCount; i++) {
            if (arr[i].compareTo(arr[i + 1]) > 0) {
                E tempElement = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tempElement;
            }
        }

        sortCount++;

        bubbleSort(arr, sortCount);
    }

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{11, 22, 13, 4, 5555, 61, 70, 8, 92, 10, 1};

        System.out.println(Arrays.toString(nums));

        sort(nums);

        System.out.println(Arrays.toString(nums));
    }
}
