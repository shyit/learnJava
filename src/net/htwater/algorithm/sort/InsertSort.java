package net.htwater.algorithm.sort;

import java.util.Arrays;

/**
 * Created by 96955 on 2019/4/24.
 */
public class InsertSort {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 3, 9, 7, 2, 5, 8, 6, 4};

        System.out.println(Arrays.toString(nums));

        insert(nums);

        System.out.println(Arrays.toString(nums));
    }

    /*
    * 插入排序
    * 1.从第一个元素开始，该元素可以认为已经被排序
    * 2.取出下一个元素，在已经排序的元素序列中从后向前扫描
    * 3.如果该元素（已排序）大于新元素，将该元素移到下一位置
    * 4.重复步骤3，直到找到已排序的元素小于或者等于新元素的位置
    * 5.将新元素插入到该位置后
    * 6.重复步骤2-5
    * */
    private static void insert(int[] nums) {
        for (int i = 1; i < nums.length; i++) {

            int temp = nums[i];
            int j = i;

            while ((j > 0) && (nums[j - 1] > temp)) {
                nums[j] = nums[j - 1];
                j--;
            }

            nums[j] = temp;
        }
    }

}
