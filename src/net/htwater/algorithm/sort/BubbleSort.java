package net.htwater.algorithm.sort;

import java.util.Arrays;

/**
 * Created by 96955 on 2019/4/23.
 */
public class BubbleSort {

    public static void main(String[] args) {

        int[] nums = new int[]{1, 3, 9, 7, 2, 5, 8, 6, 4};

        System.out.println(Arrays.toString(nums));

        bubble(nums);

        System.out.println(Arrays.toString(nums));
    }


    /*
    * 冒泡排序
    * 1.比较相邻的元素，如果第一个比第二个大，就交换他们两个。
    * 2.对每一对相邻元素做同样的工作，从开始第一对到结尾最后一对。这步做完后，最后的元素回事最大的数。
    * 3. 针对所有的元素重复以上的步骤，除了最后一个
    * 4.持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较
    * */
    private static void bubble(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                int temp = nums[j];
                if (nums[j] > nums[j + 1]) {
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }

}
