package net.htwater.algorithmmuke.heap;


import net.htwater.algorithmmuke.array.HtArray;
import sun.security.krb5.internal.tools.Klist;

import java.util.ArrayList;

public class MaxHeap<E extends Comparable<E>> {
    private HtArray<E> data;

    public MaxHeap(int capacity) {
        data = new HtArray<>(capacity);
    }

    public MaxHeap() {
        data = new HtArray<>();
    }

    public int size() {
        return data.getSize();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    private int parent(int index) {
        if (index == 0) {
            throw new RuntimeException("index 0 do not have parent");
        }
        return (index - 1) / 2;
    }

    private int leftChild(int index) {
        return index * 2 + 1;
    }


    private int rightChild(int index) {
        return index * 2 + 2;
    }

    public void add(E e) {
        data.addLast(e);
        siftUp(data.getSize() - 1);
    }

    private void siftUp(int k) {
        if (k == 0) {
            return;
        }

        E parentElement = data.get(parent(k));
        E currentElement = data.get(k);

        if (data.get(k).compareTo(parentElement) > 0) {
            E tempElement = parentElement;
            data.set(parent(k),currentElement);
            data.set(k,tempElement);
            siftUp(parent(k));
        }
    }

    public E findMax() {
        if (data == null) {
            throw new RuntimeException("heap is empty");
        }

        return data.get(0);
    }

    public E extractMax() {
        E ret = findMax();

        data.set(0, data.get(data.getSize() - 1));

        data.removeLast();

        siftDown(0);

        return ret;
    }

    private void siftDown(int k) {
        int size = data.getSize();
        int leftIndex = k * 2 + 1;
        int rightIndex = k * 2 + 2;

        int maxIndex = k;
        if (leftIndex < size && data.get(leftIndex).compareTo(data.get(maxIndex)) > 0) {
            maxIndex = leftIndex;
        }

        if (rightIndex < size && data.get(rightIndex).compareTo(data.get(maxIndex)) > 0) {
            maxIndex = rightIndex;
        }

        if (maxIndex != k) {
            E tempElement = data.get(k);
            data.set(k, data.get(maxIndex));
            data.set(maxIndex, tempElement);
            siftDown(maxIndex);
        }
    }


}
