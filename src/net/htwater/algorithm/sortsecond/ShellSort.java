package net.htwater.algorithm.sortsecond;

import java.util.Arrays;

/**
* 类  名：ShellSort
* 描  述：希尔排序
* <p>
* 功能一：
*
* @author ShenHaiyun no.HT151 软件部移动组
* @date
*/
public class ShellSort {
    public static void main(String[] args) {
        int[] arr=new int[]{5,7,2,23,9,4,1,0,5,7};

        System.out.println(Arrays.toString(arr));

        shellSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    /*
     * 希尔排序
     * 1.先取一个小于n的整数d1作为第一个增量，把文件的全部记录分组，所有距离为d1的倍数的记录放在同一组中
     * 2.先在各组内进行直接插入排序，
     * 3.然后，取第二个增量d2<d1重复上述分组和排序
     * 4.当增量dn=1,即所有记录放在同一组中进行直接插入排序为止
     * */
    private static void shellSort(int[] arr) {
        //遍历所有步长
        for (int step=arr.length/2;step>0; step=step/2){
            for (int i = 0; i < step; i++) {
                for (int j = i+step; j < arr.length; j=j+step) {
                    int temp=arr[j];

                    int k= j;
                    while ( k >i && arr[k-step]>temp) {
                        arr[k]=arr[k-step];
                        k=k-step;
                    }
                    arr[k]=temp;
                }
            }

        }

    }
}
