package net.htwater.algorithmmuke.sort.quicksort;

public class LeetCode215Solution {
    public int findKthLargest(int[] nums, int k) {
        int start = 0;
        int end = nums.length - 1;
        int targetIndex = nums.length - k;
        return sort(nums, start, end, targetIndex);
    }

    private static int sort(int[] arr, int start, int end, int targetIndex) {
        if (start >= end) {
            return arr[start];
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

        if (i == targetIndex) {
            return arr[i];
        } else if (i < targetIndex) {
            return sort(arr, i + 1, end, targetIndex);
        } else {
            return sort(arr, start, i - 1, targetIndex);
        }

    }

    public static void main(String[] args) {

    }
}
