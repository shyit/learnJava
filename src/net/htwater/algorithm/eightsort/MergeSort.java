package net.htwater.algorithm.eightsort;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 7, 2, 23, 9, 4, 1, 0, 5, 7};

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        mergeSort(arr, 0, arr.length-1);

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void mergeSort(int[] arr, int start, int end) {
        if (start==end){
            return;
        }

        int middle = (start + end) / 2;
        mergeSort(arr, start, middle);
        mergeSort(arr, middle + 1, end);


        int[] tempArr = new int[end - start + 1];
        int i=start;
        int j=middle+1;
        int k=0;

        while (i<=middle&&j<=end){
            if (arr[i] <= arr[j]) {
                tempArr[k] = arr[i];
                i++;
                k++;
            } else{
                tempArr[k] = arr[j];
                j++;
                k++;
            }
        }

        while (i<=middle){
            tempArr[k] = arr[i];
            i++;
            k++;
        }

        while (j<=end){
            tempArr[k] = arr[j];
            j++;
            k++;
        }

        for (int m = 0; m < tempArr.length; m++) {
            arr[start+m]=tempArr[m];
        }
    }
}
