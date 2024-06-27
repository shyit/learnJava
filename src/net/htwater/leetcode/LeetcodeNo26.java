package net.htwater.leetcode;

import java.util.Arrays;

/**
 * 类  名: LeetcodeNo26
 * 描  述: LeetcodeNo26. 删除有序数组中的重复项
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-06-27 20:09
 */
public class LeetcodeNo26 {
    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

        int count = removeDuplicates(nums);

        System.out.println("count = " + count);
        System.out.println("nums = " + Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums.length == 1) {
            return nums.length;
        }

        int slowIndex = 0;
        int fastIndex = 1;

        while (fastIndex < nums.length) {
            if (nums[slowIndex] == nums[fastIndex]) {
                fastIndex++;
            } else {
                slowIndex++;
                nums[slowIndex] = nums[fastIndex];
                fastIndex++;
            }
        }

        return slowIndex + 1;
    }
}
