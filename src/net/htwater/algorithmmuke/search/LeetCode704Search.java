package net.htwater.algorithmmuke.search;

/**
 * 类  名: LeetCode704Search
 * 描  述: 704. 二分查找
 *
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2023-02-10 10:44
 */
public class LeetCode704Search {
    public static int search(int[] nums, int target) {
        return search2(nums, target, 0, nums.length - 1);
    }


    private static int search2(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        if (start == end && arr[start] != (target)) {
            return -1;
        }

        int middle = (start + end) / 2;

        if (arr[middle] == target) {
            return middle;
        } else if (arr[middle] <= target) {
            return search2(arr, target, middle + 1, end);
        } else {
            return search2(arr, target, start, middle);
        }

    }

    private static int search3(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;
            if (arr[middle] == target) {
                return middle;
            } else if (arr[middle] <= target) {
                start = middle + 1;
            } else {
                end = middle;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};

//        System.out.println(Arrays.toString(nums));

//        sort(nums, 0, nums.length - 1);
        int targetIndex = search3(nums, 9);

        System.out.println(targetIndex);
    }

}
