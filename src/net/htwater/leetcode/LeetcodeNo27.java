package net.htwater.leetcode;

import java.util.Arrays;

/**
 * 类  名: LeetcodeNo27
 * 描  述: LeetcodeNo27. 移除元素
 * 
 * 功  能: 
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-06-27 20:20
 */
public class LeetcodeNo27 {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};

        int count = removeElement(nums,2);

        System.out.println("count = " + count);
        System.out.println("nums = " + Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        int slowIndex = -1;
        int fastIndex = 0;

        while (fastIndex < nums.length) {
            if (val == nums[fastIndex]) {
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
