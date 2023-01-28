package net.htwater.algorithmmuke.sort.insertsort;

public class InsertSort {
    private InsertSort() {

    }


    public static <E extends Comparable<E>> void sort(E[] arr) {
        for (int i = 1; i < arr.length; i++) {
            E temp = arr[i];

            int j = i;

            while ((j > 0) && (arr[j - 1].compareTo(temp) > 0)) {
                arr[j] = arr[j - 1];
                j--;
            }

            arr[j] = temp;

        }
    }

    public static <E> void swap(E[] arr, int x, int y) {
        E tempNum = arr[x];
        arr[x] = arr[y];
        arr[y] = tempNum;
    }
}
