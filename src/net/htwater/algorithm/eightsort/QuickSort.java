package net.htwater.algorithm.eightsort;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr=new int[]{5,7,2,23,9,4,1,0,5,7};

        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        quickSort(arr,0,arr.length-1);

        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    //冒泡排序
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
