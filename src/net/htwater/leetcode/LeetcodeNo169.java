package net.htwater.leetcode;


import java.util.Arrays;

/**
 * 类  名: LeetcodeNo169
 * 描  述: LeetcodeNo169. 多数元素
 * 
 * 功  能: 
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-06-28 15:57
 */
public class LeetcodeNo169 {

    public static void main(String[] args) {
        int[] nums = new int[]{2,2,1,1,1,2,2};
        int majorityNum = majorityElement(nums);

        System.out.println("majorityNum = " + majorityNum);
    }

    public static int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
