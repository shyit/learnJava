package net.htwater.algorithmmuke.sort.quicksort;

public class LeetCode75Solution {
    public void sortColors(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        sort(nums, start, end);
    }

    private static void sort(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int i = start;
        int j = end;

        int temp = arr[start];

        while (i < j) {
            while ((i < j) && (temp <= arr[j])) {
                j--;
            }
            if (i < j) {
                arr[i] = arr[j];
                i++;
            }

            while ((i < j) && (temp >= arr[i])) {
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

}
