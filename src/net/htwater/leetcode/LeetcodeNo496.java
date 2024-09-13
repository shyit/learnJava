package net.htwater.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 类  名: LeetcodeNo496
 * 描  述: LeetcodeNo496. 下一个更大元素 I
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-09-13 09:50
 */
public class LeetcodeNo496 {

    // nums1 中数字 x 的 下一个更大元素 是指 x 在 nums2 中对应位置 右侧 的 第一个 比 x 大的元素。
    // 给你两个 没有重复元素 的数组 nums1 和 nums2 ，下标从 0 开始计数，其中nums1 是 nums2 的子集。
    // 对于每个 0 <= i < nums1.length ，找出满足 nums1[i] == nums2[j] 的下标 j ，并且在 nums2 确定 nums2[j] 的 下一个更大元素 。
    // 如果不存在下一个更大元素，那么本次查询的答案是 -1 。
    // 返回一个长度为 nums1.length 的数组 ans 作为答案，满足 ans[i] 是如上所述的 下一个更大元素 。
    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 1, 2};
        int[] nums2 = new int[]{1, 3, 4, 2};

        int[] ans = nextGreaterElement(nums1, nums2);

        System.out.println("ans = " + Arrays.toString(ans));
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        // 单调栈
        Stack<Integer> stack = new Stack<>();
        // 使用hashMap记录结果 方便查找
        Map<Integer, Integer> map = new HashMap<>();

        // 使用单调栈的功能 查找出下一个更大元素
        for (int i = 0; i < nums2.length; i++) {
            int num = nums2[i];
            while (!stack.isEmpty() && num > nums2[stack.peek()]) {
                int indexTemp = stack.pop();
                map.put(nums2[indexTemp], num);
            }

            stack.push(i);
        }

        int[] ans = new int[nums1.length];

        // 从hashMap中查找出数据
        for (int i = 0; i < nums1.length; i++) {
            int num = nums1[i];
            if (map.containsKey(num)) {
                ans[i] = map.get(num);
            } else {
                ans[i] = -1;
            }
        }

        return ans;
    }
}
