package net.htwater.algorithmmuke.sort.shellsort;

import java.util.Arrays;

public class ShellSort {
    private ShellSort() {
    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        int step = arr.length / 3;
        shellSort(arr, step);
    }

    private static <E extends Comparable<E>> void shellSort(E[] arr, int step) {
        if (step <= 0) {
            return;
        }

        for (int i = 0; i < arr.length; i++) {
            E tempElement = arr[i];
            for (int j = i; j >= 0; j = j - step) {
                if (arr[j].compareTo(tempElement) > 0) {
                    arr[j + step] = arr[j];
                    arr[j] = tempElement;
                }
            }
        }

        step = step / 2;
        shellSort(arr, step);
    }

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{11, 22, 13, 4, 5555, 61, 70, 8, 92, 101,123};

        System.out.println(Arrays.toString(nums));

        sort(nums);

        System.out.println(Arrays.toString(nums));
    }

}
