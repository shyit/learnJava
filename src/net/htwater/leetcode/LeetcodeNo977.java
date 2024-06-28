package net.htwater.leetcode;


import java.util.Arrays;

/**
 * 类  名: LeetcodeNo977
 * 描  述: LeetcodeNo977. 有序数组的平方
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-06-28 16:08
 */
public class LeetcodeNo977 {

    //    给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
    public static void main(String[] args) {
        int[] nums = new int[]{-7,-3,2,3,11};
        int[] numsSquare = sortedSquares(nums);

        System.out.println("numsSquare = " + Arrays.toString(numsSquare));

    }

    public static int[] sortedSquares(int[] nums) {
        int[] numsSquare = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsSquare[i] = nums[i] * nums[i];
        }
        Arrays.sort(numsSquare);

        return numsSquare;
    }
}
