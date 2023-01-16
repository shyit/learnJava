package net.htwater.algorithmmuke.sort.selectsort;

public class SelectSort {
    private SelectSort() {

    }

    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[minIndex].compareTo(arr[j])>0) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                swap(arr, i, minIndex);
            }
        }
    }


    public static <E> void swap(E[] arr, int x, int y) {
        E tempNum = arr[x];
        arr[x] = arr[y];
        arr[y] = tempNum;
    }

}
