package net.htwater.algorithm.sortsecond;

import java.util.Arrays;

/**
* 类  名：QuickSort
* 描  述：快速排序
* <p>
* 功能一：
*
* @author ShenHaiyun no.HT151 软件部移动组
* @date
*/
public class QuickSort {
    public static void main(String[] args) {
        int[] arr=new int[]{5,7,2,23,9,4,1,0,5,7};

        System.out.println(Arrays.toString(arr));

        quickSort(arr,0,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }

    /*
     * 快速排序
     * 1.挑选基准值：从数列中挑出一个元素，称为基准
     * 2.分割：重新排序数列，所有比基准小的元素放在基准前面，所有比基准大的元素摆在基准后面（与基准相等的数可以到任何一边）。
     *   在这个分割结束之后，对基准值的排序就已经完成。
     * 3.递归排序子序列：递归地将小于基准值元素的子序列和大于基准值元素的子序列排序
     * */
    private static void quickSort(int[] arr, int start, int end) {
        if (start>=end){
            return;
        }

        int initStart=start;
        int initEnd=end;
        int temp=arr[start];

        while (start<end){
            while (arr[end]>=temp&&start<end){
                end--;
            }
            arr[start]=arr[end];

            while (arr[start]<=temp&&start<end){
                start++;
            }
            arr[end]=arr[start];
        }

        arr[start]=temp;

        quickSort(arr,initStart,start-1);
        quickSort(arr,start+1,initEnd);
    }
}
