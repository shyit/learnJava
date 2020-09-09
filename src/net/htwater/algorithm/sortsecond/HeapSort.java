package net.htwater.algorithm.sortsecond;

import java.util.Arrays;

/**
* 类  名：HeapSort
* 描  述：堆排序
* <p>
* 功能一：
*
* @author ShenHaiyun no.HT151 软件部移动组
* @date
*/
public class HeapSort {
    public static void main(String[] args) {
        int[] arr=new int[]{9,6,8,7,0,1,10,4,2};
        System.out.println(Arrays.toString(arr));

        System.out.println("=========================");

        heapSort(arr);

        System.out.println("=========================");

        System.out.println(Arrays.toString(arr));
    }

    //把数组转换成最大堆积，
    //重复从最大堆积取出数值最大的结点，(把根节点和最后一个结点交换，吧交换狗的最后一个节点移出堆)
    //让残余的堆积位置最大堆积性质
    private static void heapSort(int[] arr) {
        for (int i = arr.length-1; i >=0; i--) {
            maxHeap(arr,arr.length-1,i);
        }

        for (int i = arr.length-1; i >0; i--) {
            maxHeap(arr,i,0);

            int temp=arr[0];
            arr[0]=arr[i];
            arr[i]=temp;

            System.out.println(Arrays.toString(arr));
        }
    }

    public static void maxHeap(int[] arr,int size,int index){
        int leftNodeIndex=2*index+1;
        int rightNodeIndex=2*index+2;

        int max=index;
        if (leftNodeIndex<=size&&arr[leftNodeIndex] > arr[max]) {
            max=leftNodeIndex;
        }
        if (rightNodeIndex<=size&&arr[rightNodeIndex] > arr[max]) {
            max = rightNodeIndex;
        }

        if (max!=index){
            int temp=arr[index];
            arr[index]=arr[max];
            arr[max]=temp;

            maxHeap(arr,size,max);
        }
    }
}
