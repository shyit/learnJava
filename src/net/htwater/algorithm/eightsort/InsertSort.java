package net.htwater.algorithm.eightsort;

public class InsertSort {
    public static void main(String[] args) {
        int[] arr=new int[]{5,7,2,23,9,4,1,0,5,7};

        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();

        insertSort(arr);

        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

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
