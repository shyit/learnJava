package net.htwater.algorithmmuke.heap;

import java.util.Arrays;
import java.util.Random;

public class MaxHeapTest {
    public static void main(String[] args) {
        int n=10;

        MaxHeap<Integer> maxHeap = new MaxHeap<>();

        Random random = new Random();
        for (int i = 0; i < n; i++) {
            maxHeap.add(random.nextInt(n * 10));
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = maxHeap.extractMax();
        }

        System.out.println(Arrays.toString(arr));
    }
}
