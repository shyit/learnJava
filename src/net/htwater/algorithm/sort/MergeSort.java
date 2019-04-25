package net.htwater.algorithm.sort;

import java.util.Arrays;

/**
 * Created by 96955 on 2019/4/25.
 */
public class MergeSort {
    public static void main(String[] args) {

        int[] nums = new int[]{1, 3, 9, 7, 2, 5, 8, 6, 4};

        System.out.println(Arrays.toString(nums));

        merge(nums, 0, nums.length - 1);

        System.out.println(Arrays.toString(nums));
    }


    /*
    * 归并排序
    * 1.申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列
    * 2.设定两个指针，最初位置分别为两个已经排序序列的起始位置
    * 3.比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置
    * 4.重复步骤3直到某一指针到达序列尾
    * 5.将另一序列剩下的所有元素直接复制到合并序列尾
    * */
    private static void merge(int[] nums, int start, int end) {
        if (start == end) {
            return;
        }

        int  middle=(end+start)/2;

        merge(nums, start, middle);
        merge(nums, middle + 1, end);

        int[] tempNums = new int[end - start + 1];
        int i = start;
        int j = middle + 1;
        int k = 0;
        while ((i <= middle) && (j <= end)) {
            if (nums[i] < nums[j]) {
                tempNums[k] = nums[i];
                i++;
                k++;
            } else {
                tempNums[k] = nums[j];
                j++;
                k++;
            }
        }

        while (i <= middle){
            tempNums[k]=nums[i];
            i++;
            k++;
        }

        while (j <= end){
            tempNums[k] = nums[j];
            j++;
            k++;
        }

        for (int m = 0; m < tempNums.length; m++) {
            nums[start + m] = tempNums[m];
        }
    }
}
