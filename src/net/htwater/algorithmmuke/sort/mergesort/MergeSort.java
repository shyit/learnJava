package net.htwater.algorithmmuke.sort.mergesort;

import java.util.Arrays;

public class MergeSort {

    public static <E extends Comparable> void sort(E[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int middle = (start + end) / 2;

        sort(arr, start, middle);
        sort(arr, middle + 1, end);

        E[] tempArr = (E[]) new Comparable[end - start + 1];

        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = arr[start + i];
        }

        int i = start;
        int j = middle + 1;

        for (int k = start; k <= end; k++) {
            if (i > middle) {
                arr[k] = tempArr[j - start];
                j++;
            } else if (j > end) {
                arr[k] = tempArr[i - start];
                i++;
            } else if (tempArr[i - start].compareTo(tempArr[j - start]) <= 0) {
                arr[k] = tempArr[i - start];
                i++;
            } else {
                arr[k] = tempArr[j - start];
                j++;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{11, 22, 13, 4, 5555, 61, 70, 8, 92, 10};

        System.out.println(Arrays.toString(nums));

        sort(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }

}
