package net.htwater.leetcode;

import java.util.Arrays;

/**
 * 类  名: LeetcodeNo268
 * 描  述: LeetcodeNo268. 丢失的数字
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-09-10 17:48
 */
public class LeetcodeNo268 {

    public static void main(String[] args) {
        int[] nums = new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1};

        int missingNum = missingNumber(nums);

        System.out.println("missingNum = " + missingNum);
    }

    public static int missingNumber(int[] nums) {
        // 数组排序
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {
            // index和数据不一样 这个index就是丢失的数据
            if (i != nums[i]) {
                return i;
            }
        }

        return 0;
    }
}
