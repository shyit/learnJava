package net.htwater.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 类  名: LeetcodeNo448
 * 描  述: LeetcodeNo448. 找到所有数组中消失的数字 简单
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-03-27 20:23
 */
public class LeetcodeNo448 {

    //    给你一个含 n 个整数的数组 nums ，其中 nums[i] 在区间 [1, n] 内。请你找出所有在 [1, n] 范围内但没有出现在 nums 中的数字，并以数组的形式返回结果。
    public static void main(String[] args) {
        int[] nums = new int[]{4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> resultList = findDisappearedNumbers2(nums);

        // 5 6
        resultList.forEach(item -> System.out.println(item));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        // 标志数组
        int[] resultNums = new int[nums.length + 1];

        // 如果存在某个数值 结果数组那个数值为脚标的数值++
        for (int i = 0; i < nums.length; i++) {
            resultNums[nums[i]]++;
        }

        // 结果数组
        List<Integer> result = new ArrayList<>();
        // 遍历标志数组
        for (int i = 1; i < resultNums.length; i++) {
            if (resultNums[i] == 0) {
                result.add(i);
            }
        }

        return result;
    }

    public static List<Integer> findDisappearedNumbers2(int[] nums) {
        // 遍历数组
        // 把每个数值对应的 数值-1 为脚标的数值 设置为负数
        for (int i = 0; i < nums.length; i++) {
            int numberAbs = Math.abs(nums[i]);
            int temp = nums[numberAbs - 1];
            nums[numberAbs - 1] = -1 * Math.abs(temp);
        }

        // 结果列表
        List<Integer> result = new ArrayList<>();
        // 把所有数值为正数的(脚标+1) 加入结果列表
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }

        return result;
    }
}
