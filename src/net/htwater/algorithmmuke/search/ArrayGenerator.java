package net.htwater.algorithmmuke.search;

public class ArrayGenerator {
    private ArrayGenerator() {
    }

    public static Integer[] generateOrderedArray(int count) {
        Integer[] arr = new Integer[count];

        for (int i = 0; i < count; i++) {
            arr[i] = i;
        }

        return arr;
    }

}
