package net.htwater.algorithmmuke.search;

import net.htwater.algorithmmuke.sort.quicksort.QuickSort;

import java.util.Arrays;

public class BinarySearch {
    private BinarySearch() {

    }

    public static <E extends Comparable> int binarySearch(E[] arr, E target) {
        return search(arr, target, 0, arr.length - 1);
    }

    private static <E extends Comparable> int search(E[] arr, E target, int start, int end) {
        if (start > end) {
            return -1;
        }

        if (start == end && arr[start].compareTo(target) != 0) {
            return -1;
        }

        int middle = (start + end) / 2;

        if (arr[middle].compareTo(target) == 0) {
            return middle;
        } else if (arr[middle].compareTo(target) <= 0) {
            return search(arr, target, middle + 1, end);
        } else {
            return search(arr, target, start, middle);
        }

    }


    public static void main(String[] args) {
        Integer[] nums = new Integer[]{11, 22, 13, 4, 5555, 61, 70, 8, 92, 10, 1};
        QuickSort.quickSort(nums);

        System.out.println(Arrays.toString(nums));

//        sort(nums, 0, nums.length - 1);
        int index = binarySearch(nums, 71);

        System.out.println(index);
    }

}
