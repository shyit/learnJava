package net.htwater.leetcode;

import java.util.Arrays;

/**
 * 类  名: LeetcodeNo338
 * 描  述: LeetcodeNo338. 比特位计数
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-04-29 11:04
 */
public class LeetcodeNo338 {
    public static void main(String[] args) {
        int n = 5;

        int[] nums = countBits(n);

        System.out.println(Arrays.toString(nums));
    }

    public static int[] countBits(int n) {
        int[] nums = new int[n + 1];

        nums[0] = 0;
        for (int i = 0; i < n + 1; i++) {
            if (i % 2 == 1) {
                // 如果当前是奇数 则1的个数为前一个加1
                nums[i] = nums[i - 1] + 1;
            } else {
                // 如果当前是偶数 则与其一半的数相等
                nums[i] = nums[i / 2];
            }

        }

        return nums;
    }
}
