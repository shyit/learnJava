package net.htwater.algorithm.sortsecond;

import java.util.Arrays;

/**
* 类  名：MergeSort
* 描  述：归并排序
* <p>
* 功能一：
*
* @author ShenHaiyun no.HT151 软件部移动组
* @date
*/
public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 2, 23, 9, 4, 1, 0, 5, 7};

        System.out.println(Arrays.toString(arr));

        mergeSort(arr, 0, arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    /*
     * 归并排序
     * 1.申请空间，使其大小为两个已经排序序列之和，该空间用来存放合并后的序列
     * 2.设定两个指针，最初位置分别为两个已经排序序列的起始位置
     * 3.比较两个指针所指向的元素，选择相对小的元素放入到合并空间，并移动指针到下一位置
     * 4.重复步骤3直到某一指针到达序列尾
     * 5.将另一序列剩下的所有元素直接复制到合并序列尾
     * */
    private static void mergeSort(int[] arr, int start, int end) {
        if (start==end){
            return;
        }

        int middle = (start + end) / 2;
        mergeSort(arr, start, middle);
        mergeSort(arr, middle + 1, end);


        int[] tempArr = new int[end - start + 1];
        int i=start;
        int j=middle+1;
        int k=0;

        while (i<=middle&&j<=end){
            if (arr[i] <= arr[j]) {
                tempArr[k] = arr[i];
                i++;
                k++;
            } else{
                tempArr[k] = arr[j];
                j++;
                k++;
            }
        }

        while (i<=middle){
            tempArr[k] = arr[i];
            i++;
            k++;
        }

        while (j<=end){
            tempArr[k] = arr[j];
            j++;
            k++;
        }

        for (int m = 0; m < tempArr.length; m++) {
            arr[start+m]=tempArr[m];
        }
    }
}
