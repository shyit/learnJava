package net.htwater.algorithm.sortsecond;

/**
* 类  名：SelectSort
* 描  述：选择排序
* <p>
* 功能一：
*
* @author ShenHaiyun no.HT151 软件部移动组
* @date
*/
public class SelectSort {
    public static void main(String[] args) {
        int[] arr=new int[]{5,7,2,23,9,4,1,0,5,7};

        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        selectSort(arr);

        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    /*
     * 选择算法
     * 1.首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置
     * 2.然后，再从剩余未排序元素中继续寻找最小（大）元素
     * 3.以此类推，直到所有元素均排序完毕
     * */
    private static void selectSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int tempIndex=i;
            for (int j = i; j <arr.length ; j++) {
                if (arr[tempIndex]>arr[j]){
                    tempIndex=j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[tempIndex];
            arr[tempIndex]=temp;
        }
    }
}
