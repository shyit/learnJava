package net.htwater.algorithm.eightsort;

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
