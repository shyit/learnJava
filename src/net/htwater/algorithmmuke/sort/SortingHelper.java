package net.htwater.algorithmmuke.sort;

import net.htwater.algorithmmuke.sort.selectsort.SelectSort;

import java.math.BigDecimal;

public class SortingHelper {
    private SortingHelper() {

    }

    public static <E extends Comparable> boolean isSorted(E[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].compareTo(arr[i - 1]) < 0) {
                return false;
            }
        }

        return true;
    }

    public static <E extends Comparable<E>> void sortTest(String sortName, E[] arr) {

//        System.out.println(Arrays.toString(arr));

        Long startTime = System.nanoTime();

        switch (sortName) {
            case "selectSort":
                SelectSort.sort(arr);
                break;
            default:
        }

        Long endTime = System.nanoTime();

//        System.out.println(Arrays.toString(arr));


        if (SortingHelper.isSorted(arr)) {
            Double runTime = (endTime - startTime) * 1.0 / 1000000000.0;
            System.out.println(new BigDecimal(runTime + ""));
        } else {
            System.out.println("排序失败");
        }
    }
}
