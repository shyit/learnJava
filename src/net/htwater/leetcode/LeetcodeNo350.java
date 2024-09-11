package net.htwater.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 类  名: LeetcodeNo350
 * 描  述: LeetcodeNo350. 两个数组的交集 II
 *
 * 功  能:
 *
 * @author ShenHaiyun no.HT151 软件部移动组
 * @date 2024-09-11 14:41
 */
public class LeetcodeNo350 {

    //    给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。
    //    返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。
    //    可以不考虑输出结果的顺序。
    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 9, 5};
        int[] nums2 = new int[]{9, 4, 9, 8, 4};

        int[] intersectNums = intersect(nums1, nums2);

        System.out.println(Arrays.toString(intersectNums));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        // 排序两组数据
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        List<Integer> numList = new ArrayList<>();

        int firstIndex = 0;
        int secondIndex = 0;

        int firstSize = nums1.length;
        int secondSize = nums2.length;

        while (firstIndex < firstSize && secondIndex < secondSize) {
            int firstTemp = nums1[firstIndex];
            int secondTemp = nums2[secondIndex];

            if (firstTemp > secondTemp) {
                secondIndex++;
            } else if (firstTemp < secondTemp) {
                firstIndex++;
            } else {
                // 有一样的数据 加入 结果列表
                numList.add(firstTemp);
                firstIndex++;
                secondIndex++;
            }
        }

        int[] resultNums = numList.stream().mapToInt(item -> item).toArray();

        return resultNums;
    }
}
