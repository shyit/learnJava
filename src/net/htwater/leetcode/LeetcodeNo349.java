package net.htwater.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 类  名: LeetcodeNo349
 * 描  述: LeetcodeNo349. 两个数组的交集
 * <p>
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-09-10 18:16
 */
public class LeetcodeNo349 {

    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};

        int[] intersectionNum = intersection(nums1, nums2);

        System.out.println(Arrays.toString(intersectionNum));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        // 第一组数据的set
        Set<Integer> nums1Set = new HashSet<>();
        // 结果set
        Set<Integer> resultSet = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            nums1Set.add(nums1[i]);
        }

        for (int i = 0; i < nums2.length; i++) {
            int num = nums2[i];
            // 第二组数据在第一组数据的set中 则这个数据加入结果set
            if (nums1Set.contains(num)) {
                resultSet.add(num);
            }
        }

        int[] resultNums = resultSet.stream().mapToInt(item -> Integer.valueOf(item)).toArray();

        return resultNums;
    }
}
