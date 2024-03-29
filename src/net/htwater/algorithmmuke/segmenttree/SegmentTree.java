package net.htwater.algorithmmuke.segmenttree;

import java.util.Arrays;

public class SegmentTree<E> {
    private E[] tree;
    private E[] data;
    private Merger<E> merger;

    public SegmentTree(E[] arr, Merger<E> merger) {
        this.merger = merger;

        data = (E[]) new Object[arr.length];
        for (int i = 0; i < arr.length; i++) {
            data[i] = arr[i];
        }

        tree = (E[]) new Object[4 * arr.length];

        buildSegmentTree(0, 0, data.length - 1);
    }

    private void buildSegmentTree(int treeIndex, int left, int right) {
        if (left == right) {
            tree[treeIndex] = data[left];
            return;
        }

        int leftTreeIndex = leftChild(treeIndex);
        int rightTreeIndex = rightChild(treeIndex);

        int middle = (left + right) / 2;

        buildSegmentTree(leftTreeIndex, left, middle);
        buildSegmentTree(rightTreeIndex, middle + 1, right);

        tree[treeIndex] = merger.merge(tree[leftTreeIndex], tree[rightTreeIndex]);
    }

    public int getSize() {
        return data.length;
    }

    public E get(int index) {
        if (index < 0 || index >= data.length) {
            throw new RuntimeException("index is illegal");
        }
        return data[index];
    }

    private int leftChild(int index) {
        return 2 * index + 1;
    }

    private int rightChild(int index) {
        return 2 * index + 2;
    }

    public E query(int queryLeft, int queryRight) {
        if ((queryLeft < 0 || queryLeft >= data.length)
                || (queryRight < 0 || queryRight >= data.length)) {
            throw new RuntimeException("index is illegal");
        }

        return segmentQuery(0, 0, data.length - 1, queryLeft, queryRight);
    }

    private E segmentQuery(int treeIndex, int l, int r, int queryLeft, int queryRight) {
        if (l == queryLeft && r == queryRight) {
            return tree[treeIndex];
        }

        int middle = (l + r) / 2;
        int leftTreeIndex = leftChild(treeIndex);
        int rightTreeIndex = rightChild(treeIndex);

        if (queryLeft >= middle + 1) {
            return segmentQuery(rightTreeIndex, middle + 1, r, queryLeft, queryRight);
        } else if (queryRight <= middle) {
            return segmentQuery(leftTreeIndex, l, middle, queryLeft, queryRight);
        }

        E leftResult = segmentQuery(leftTreeIndex, l, middle, queryLeft, middle);
        E rightResult = segmentQuery(rightTreeIndex, middle + 1, r, middle + 1, queryRight);

        return merger.merge(leftResult, rightResult);
    }

    public void set(int index, E e) {
        if (index < 0 || index >= data.length) {
            throw new RuntimeException("index is illegal");
        }

        data[index] = e;

        set(0, 0, data.length - 1, index, e);
    }

    private void set(int treeIndex, int left, int right, int index, E e) {
        if (left == right) {
            tree[treeIndex] = e;
            return;
        }

        int middle = (left + right) / 2;
        int leftTreeIndex = leftChild(treeIndex);
        int rightTreeIndex = rightChild(treeIndex);

        if (index >= middle) {
            set(rightTreeIndex, middle + 1, right, index, e);
        } else {
            set(leftTreeIndex, left, middle, index, e);
        }

        tree[treeIndex] = merger.merge(tree[leftTreeIndex], tree[rightTreeIndex]);
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        res.append("[");
        for (int i = 0; i < tree.length; i++) {
            if (tree[i] != null) {
                res.append(tree[i]);
            } else {
                res.append("null");
            }

            if (i != tree.length - 1) {
                res.append(", ");
            }
        }
        res.append("]");
        return res.toString();
    }

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{-2, 0, 3, -5, 2, -1};

        System.out.println(Arrays.toString(nums));

        SegmentTree<Integer> segmentTree = new SegmentTree<>(nums, new Merger<Integer>() {
            @Override
            public Integer merge(Integer a, Integer b) {
                return a + b;
            }
        });

        System.out.println(Arrays.toString(nums));
        System.out.println(segmentTree);

        System.out.println(segmentTree.query(2, 4));
    }
}
