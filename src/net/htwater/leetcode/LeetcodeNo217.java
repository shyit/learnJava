package net.htwater.leetcode;

import java.util.HashSet;

/**
 * 类  名: LeetcodeNo217
 * 描  述: LeetcodeNo217. 存在重复元素
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-07-13 19:43
 */
public class LeetcodeNo217 {

    //    给你一个整数数组 nums 。如果任一值在数组中出现 至少两次 ，返回 true ；如果数组中每个元素互不相同，返回 false 。
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 1};

        boolean flag = containsDuplicate(nums);

        System.out.println("flag = " + flag);
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> sets = new HashSet<>();
        for (int num : nums) {
            if (sets.contains(num)) {
                return true;
            } else {
                sets.add(num);
            }
        }

        return false;
    }
}
