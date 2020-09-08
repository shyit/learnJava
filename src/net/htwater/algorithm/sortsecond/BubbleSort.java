package net.htwater.algorithm.sortsecond;

import java.util.Arrays;

/**
* 类  名：BubbleSort
* 描  述：冒泡排序
* <p>
* 功能一：
*
* @author ShenHaiyun no.HT151 软件部移动组
* @date
*/
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr=new int[]{5,7,2,9,4,1,0,5,7};

        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));

    }

    /*
     * 冒泡排序
     * 1.比较相邻的元素，如果第一个比第二个大，就交换他们两个。
     * 2.对每一对相邻元素做同样的工作，从开始第一对到结尾最后一对。这步做完后，最后的元素回事最大的数。
     * 3.针对所有的元素重复以上的步骤，除了最后一个
     * 4.持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较
     * */
    private static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
