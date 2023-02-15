package net.htwater.algorithmmuke.queue;


public class LeetCode40getLeastNumbers {

//    public class HtArray<E> {
//        private E[] data;
//
//        private int size;
//
//        public HtArray(int capacity) {
//            data = (E[]) new Object[capacity];
//            size = 0;
//        }
//
//        public HtArray() {
//            this(0);
//        }
//
//        public HtArray(E[] arr) {
//            data = (E[]) new Object[arr.length];
//            for (int i = 0; i < arr.length; i++) {
//                data[i] = arr[i];
//            }
//            size = arr.length;
//        }
//
//        public E[] getData() {
//            return data;
//        }
//
//        public void setData(E[] data) {
//            this.data = data;
//        }
//
//        public int getSize() {
//            return size;
//        }
//
//        public void setSize(int size) {
//            this.size = size;
//        }
//
//        public int getCapacity() {
//            return data.length;
//        }
//
//        public boolean isEmpty() {
//            return size == 0;
//        }
//
//        public void addLast(E element) {
//
//            if (size == data.length) {
//                resize(data.length * 2);
//            }
//
//            if (size == data.length) {
//                E[] dataNew = (E[]) new Object[data.length + 1];
//                for (int i = 0; i < data.length; i++) {
//                    dataNew[i] = data[i];
//                }
//                dataNew[data.length] = element;
//                data = dataNew;
//            } else {
//                data[size] = element;
//            }
//
//            size++;
//        }
//
//
//        public void insert(int index, E element) {
//            if (index < 0 || index > size) {
//                throw new RuntimeException("HtArray insert越界");
//            }
//
//            if (size == data.length) {
//                resize(data.length * 2);
//            }
//
//            if (size == data.length) {
//                E[] dataNew = (E[]) new Object[data.length + 1];
//                for (int i = 0; i < data.length; i++) {
//                    dataNew[i] = data[i];
//                }
//                for (int i = dataNew.length - 1; i >= 0; i--) {
//                    if (i > index) {
//                        dataNew[i] = dataNew[i - 1];
//                    }
//                }
//                dataNew[index] = element;
//                data = dataNew;
//            } else {
//                for (int i = size; i >= 0; i--) {
//                    if (i > index) {
//                        data[i] = data[i - 1];
//                    }
//                }
//                data[index] = element;
//            }
//
//            size++;
//        }
//
//        public E get(int index) {
//            if (index < 0 || index > size) {
//                throw new RuntimeException("HtArray get越界");
//            }
//            return data[index];
//        }
//
//        public E getLast() {
//            return get(size - 1);
//        }
//
//        public E getFirst() {
//            return get(0);
//        }
//
//        public void set(int index, E element) {
//            if (index < 0 || index > size) {
//                throw new RuntimeException("HtArray set越界");
//            }
//            data[index] = element;
//        }
//
//        public boolean contains(E element) {
//            for (int i = 0; i < size; i++) {
//                if (data[i].equals(element)) {
//                    return true;
//                }
//            }
//            return false;
//        }
//
//        public int find(E element) {
//            for (int i = 0; i < size; i++) {
//                if (data[i].equals(element)) {
//                    return i;
//                }
//            }
//            return -1;
//        }
//
//        public E remove(int index) {
//            if (index < 0 || index > size) {
//                throw new RuntimeException("HtArray delete越界");
//            }
//
//            E ret = data[index];
//
//            for (int i = 0; i < size - 1; i++) {
//                if (i >= index) {
//                    data[i] = data[i + 1];
//                }
//            }
//            data[size - 1] = null;
//            size--;
//
//            if (size == data.length / 2) {
//                resize(data.length / 2);
//            }
//
//            return ret;
//        }
//
//        public E removeLast() {
//            return this.remove(size - 1);
//        }
//
//        public E removeFirst() {
//            return this.remove(0);
//        }
//
//        public void removeElement(E element) {
//            int index = this.find(element);
//            if (index >= 0) {
//                this.remove(index);
//            }
//        }
//
//        private void resize(int newCapacity) {
//            E[] dataNew = (E[]) new Object[newCapacity];
//            for (int i = 0; i < data.length && i < dataNew.length; i++) {
//                dataNew[i] = data[i];
//            }
//            data = dataNew;
//        }
//
//
//        @Override
//        public String toString() {
//            E[] dataNew = (E[]) new Object[size];
//            for (int i = 0; i < size; i++) {
//                dataNew[i] = data[i];
//            }
//
//            return "HtArray{" +
//                    "data=" + Arrays.toString(dataNew) +
//                    ", size=" + size +
//                    ", capacity=" + data.length +
//                    '}';
//        }
//    }
//
//    public class MaxHeap<E extends Comparable<E>> {
//        private HtArray<E> data;
//
//        public MaxHeap(int capacity) {
//            data = new HtArray<>(capacity);
//        }
//
//        public MaxHeap() {
//            data = new HtArray<>();
//        }
//
//        public MaxHeap(E[] arr) {
//            data = new HtArray<>(arr);
//            for (int i = data.getSize() - 1; i >= 0; i--) {
//                siftDown(i);
//            }
//        }
//
//        public int size() {
//            return data.getSize();
//        }
//
//        public boolean isEmpty() {
//            return data.isEmpty();
//        }
//
//        private int parent(int index) {
//            if (index == 0) {
//                throw new RuntimeException("index 0 do not have parent");
//            }
//            return (index - 1) / 2;
//        }
//
//        private int leftChild(int index) {
//            return index * 2 + 1;
//        }
//
//
//        private int rightChild(int index) {
//            return index * 2 + 2;
//        }
//
//        public void add(E e) {
//            data.addLast(e);
//            siftUp(data.getSize() - 1);
//        }
//
//        private void siftUp(int k) {
//            if (k == 0) {
//                return;
//            }
//
//            E parentElement = data.get(parent(k));
//            E currentElement = data.get(k);
//
//            if (data.get(k).compareTo(parentElement) > 0) {
//                E tempElement = parentElement;
//                data.set(parent(k), currentElement);
//                data.set(k, tempElement);
//                siftUp(parent(k));
//            }
//        }
//
//        public E findMax() {
//            if (data == null) {
//                throw new RuntimeException("heap is empty");
//            }
//
//            return data.get(0);
//        }
//
//        public E extractMax() {
//            E ret = findMax();
//
//            data.set(0, data.get(data.getSize() - 1));
//
//            data.removeLast();
//
//            siftDown(0);
//
//            return ret;
//        }
//
//        private void siftDown(int k) {
//            int size = data.getSize();
//            int leftIndex = k * 2 + 1;
//            int rightIndex = k * 2 + 2;
//
//            int maxIndex = k;
//            if (leftIndex < size && data.get(leftIndex).compareTo(data.get(maxIndex)) > 0) {
//                maxIndex = leftIndex;
//            }
//
//            if (rightIndex < size && data.get(rightIndex).compareTo(data.get(maxIndex)) > 0) {
//                maxIndex = rightIndex;
//            }
//
//            if (maxIndex != k) {
//                E tempElement = data.get(k);
//                data.set(k, data.get(maxIndex));
//                data.set(maxIndex, tempElement);
//                siftDown(maxIndex);
//            }
//        }
//
//        public E replace(E e) {
//            E ret = findMax();
//            data.set(0, e);
//            siftDown(0);
//            return ret;
//        }
//
//
//    }
//
//
//    public interface HtQueue<E> {
//        int getSize();
//
//        boolean isEmpty();
//
//        void enqueue(E e);
//
//        E dequeue();
//
//        E getFront();
//    }
//
//    public class PriorityQueue<E extends Comparable<E>> implements HtQueue<E> {
//
//        private MaxHeap<E> maxHeap;
//
//        public PriorityQueue() {
//            maxHeap = new MaxHeap<>();
//        }
//
//        @Override
//        public int getSize() {
//            return maxHeap.size();
//        }
//
//        @Override
//        public boolean isEmpty() {
//            return maxHeap.isEmpty();
//        }
//
//        @Override
//        public void enqueue(E e) {
//            maxHeap.add(e);
//        }
//
//        @Override
//        public E dequeue() {
//            return maxHeap.extractMax();
//        }
//
//        @Override
//        public E getFront() {
//            return maxHeap.findMax();
//        }
//
//    }

    public int getLeastNumbers(int[] arr, int k) {
        java.util.PriorityQueue<Integer> priorityQueue = new java.util.PriorityQueue<>();
        for (int i = 0; i < k; i++) {
            priorityQueue.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (!priorityQueue.isEmpty() && arr[i] < priorityQueue.peek()) {
                priorityQueue.poll();
                priorityQueue.add(arr[i]);
            }
        }


        return priorityQueue.peek();
    }

}
