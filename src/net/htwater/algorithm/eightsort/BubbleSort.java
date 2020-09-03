package net.htwater.algorithm.eightsort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr=new int[]{5,7,2,9,4,1,0,5,7};

        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        bubbleSort(arr);

        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    //冒泡排序
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
