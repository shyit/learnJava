package net.htwater.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 类  名: LeetcodeNo1
 * 描  述: LeetcodeNo1. 两数之和 简单
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-03-25 17:01
 */
public class LeetcodeNo1 {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum2(nums, target);

        // [0,1]
        System.out.println("[" + result[0] + "," + result[1] + "]");
    }

    // 暴力法
    public static int[] twoSum(int[] nums, int target) {
        // 第一个数字
        for (int i = 0; i < nums.length - 1; i++) {
            // 第二个数字
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    int[] result = new int[2];
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }

        return new int[0];
    }

    // hashMap 节省匹配时间
    public static int[] twoSum2(int[] nums, int target) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length - 1; i++) {
            // 判断匹配的数值 是否存在
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            }
            // 把数字放入到 hashMap 中
            hashMap.put(nums[i], i);
        }

        // 不存在 返回
        return new int[0];
    }
}
