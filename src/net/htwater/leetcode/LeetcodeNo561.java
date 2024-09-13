package net.htwater.leetcode;

import java.util.Arrays;

/**
 * 类  名: LeetcodeNo561
 * 描  述: LeetcodeNo561. 数组拆分
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-09-13 14:02
 */
public class LeetcodeNo561 {

    // 给定长度为 2n 的整数数组 nums ，你的任务是将这些数分成 n 对,
    // 例如 (a1, b1), (a2, b2), ..., (an, bn) ，使得从 1 到 n 的 min(ai, bi) 总和最大。
    //返回该 最大总和
    public static void main(String[] args) {
        int[] nums = new int[]{6, 2, 6, 5, 1, 2};

        int sum = arrayPairSum(nums);

        // sum = 9
        System.out.println("sum = " + sum);
    }

    public static int arrayPairSum(int[] nums) {
        // 排序
        Arrays.sort(nums);

        int sum = 0;
        // 序号为偶数的相加 就是最小值的和
        for (int i = 0; i < nums.length; i = i + 2) {
            sum += nums[i];
        }

        return sum;
    }
}
