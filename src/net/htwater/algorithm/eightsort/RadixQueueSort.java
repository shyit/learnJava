package net.htwater.algorithm.eightsort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
* 类  名：RadixQueueSort
* 描  述：基数排序(队列实现)
* <p>
* 功能一：
*
* @author ShenHaiyun no.HT151 软件部移动组
* @date
*/
public class RadixQueueSort {
    public static void main(String[] args) {
        int[] arr=new int[]{23,6,189,45,9,257,56,1001,789,34,65,652,5};

        System.out.println(Arrays.toString(arr));

        radixQueueSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    /*
     * 基数排序
     * 1.将所有待比较数值（正整数）统一为同样的数字长度，数字较短的数前面补零
     * 2.然后，从最低位开始，一次进行一次排序。
     * 3.这样最低位排序一直到最高位排序完成以后，数列就变成一个有序序列
     * */
    private static void radixQueueSort(int[] arr) {
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max=arr[i];
            }
        }

        int loopTimes=(max+"").length();

        for (int i = 0,n=1; i < loopTimes; i++,n*=10) {
            Queue[] queues=new Queue[10];
            for (int k=0;k<queues.length;k++){
                queues[k]=new LinkedList();
            }

            for (int j = 0; j < arr.length; j++) {
                int num=arr[j]%(n*10)/n;
                queues[num].add(arr[j]);
            }

            for (int m=0,k = 0;m<queues.length;m++){
                while (!queues[m].isEmpty()){
                    arr[k]= (int) queues[m].poll();
                    k++;
                }
            }
        }
    }
}
