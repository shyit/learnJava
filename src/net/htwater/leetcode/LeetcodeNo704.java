package net.htwater.leetcode;

/**
 * 类  名: LeetcodeNo704
 * 描  述: LeetcodeNo704. 二分查找
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-04-28 11:09
 */
public class LeetcodeNo704 {
    //    给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target  ，
    //    写一个函数搜索 nums 中的 target，如果目标值存在返回下标，否则返回 -1。
    public static void main(String[] args) {
        int[] nums = new int[]{-1, 0, 3, 5, 9, 12};
        int target = 9;

        int index = search(nums, target);

        // 4
        System.out.println(index);
    }

    public static int search(int[] nums, int target) {
        int index = binarySearch(nums, target, 0, nums.length - 1);
        return index;
    }

    private static int binarySearch(int[] nums, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int middle = (start + end) / 2;

        if (target == nums[middle]) {
            return middle;
        } else if (target < nums[middle]) {
            return binarySearch(nums, target, start, middle - 1);
        } else {
            return binarySearch(nums, target, middle + 1, end);

        }
    }

}
