package net.htwater.algorithmmuke.sort.quicksort;

import java.util.Arrays;

public class QuickSort {
    public static <E extends Comparable> void quickSort(E[] arr) {
        int start = 0;
        int end = arr.length-1;
        sort(arr, start, end);
    }

    private static <E extends Comparable> void sort(E[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int i = start;
        int j = end;

        E temp = arr[start];

        while (i < j) {
            while ((i < j) && (temp.compareTo(arr[j]) <= 0)) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[j];
                i++;
            }

            while ((i < j) && (temp.compareTo(arr[i]) >= 0)) {
                i++;
            }
            if (i < j) {
                arr[j] = arr[i];
                j--;
            }
        }

        arr[i] = temp;

        sort(arr, start, i - 1);
        sort(arr, i + 1, end);

    }

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{11, 22, 13, 4, 5555, 61, 70, 8, 92, 10,1};

        System.out.println(Arrays.toString(nums));

//        sort(nums, 0, nums.length - 1);
        quickSort(nums);

        System.out.println(Arrays.toString(nums));
    }
}
