package net.htwater.algorithmmuke.sort.quicksort;


/**
 * 类  名: Offer40Solution
 * 描  述: 剑指 Offer 40. 最小的k个数
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2023-02-09 15:23
 */
public class Offer40Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        int start = 0;
        int end = arr.length - 1;
        sort(arr, start, end, k);

        int[] sortResult = new int[k];
        for (int i = 0; i < sortResult.length; i++) {
            sortResult[i] = arr[i];
        }

        return sortResult;
    }

    private static void sort(int[] arr, int start, int end, int k) {
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

        sort(arr, start, i - 1, k);
        if (i < k - 1) {
            sort(arr, i + 1, end, k);
        }

    }

}
