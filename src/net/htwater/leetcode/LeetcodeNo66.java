package net.htwater.leetcode;

import java.util.Arrays;

/**
 * 类  名: LeetcodeNo66
 * 描  述: LeetcodeNo66. 加一
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-06-27 20:54
 */
public class LeetcodeNo66 {

    //    给定一个由 整数 组成的 非空 数组所表示的非负整数，在该数的基础上加一。
    //    最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
    //    你可以假设除了整数 0 之外，这个整数不会以零开头。
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3};

        int[] resultNums = plusOne(nums);

        System.out.println("nums = " + Arrays.toString(nums));
        System.out.println("resultNums = " + Arrays.toString(resultNums));
    }

    public static int[] plusOne(int[] digits) {
        int carryNum = 1;

        for (int i = digits.length - 1; i >= 0; i--) {
            int result = digits[i] + carryNum;
            if (result >= 10) {
                digits[i] = result % 10;
            } else {
                digits[i] = result;
                return digits;
            }
        }

        int[] resultNums = new int[digits.length + 1];
        resultNums[0] = 1;
        for (int i = 1; i < resultNums.length; i++) {
            resultNums[i] = digits[i - 1];
        }
        return resultNums;
    }
}
