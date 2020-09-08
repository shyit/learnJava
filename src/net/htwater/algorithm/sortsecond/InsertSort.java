package net.htwater.algorithm.sortsecond;

import java.util.Arrays;

/**
* 类  名：InsertSort
* 描  述：插入排序
* <p>
* 功能一：
*
* @author ShenHaiyun no.HT151 软件部移动组
* @date
*/
public class InsertSort {
    public static void main(String[] args) {
        int[] arr=new int[]{5,7,2,23,9,4,1,0,5,7};

        System.out.println(Arrays.toString(arr));

        insertSort(arr);

        System.out.println(Arrays.toString(arr));
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
    private static void insertSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int temp=arr[i];

            int j=i;
            while (j>0&&arr[j-1]>temp){
                arr[j]=arr[j-1];
                j--;
            }

            arr[j]=temp;
        }
    }
}
