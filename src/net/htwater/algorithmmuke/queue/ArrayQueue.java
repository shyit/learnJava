package net.htwater.algorithmmuke.queue;

import net.htwater.algorithmmuke.array.HtArray;

import java.util.Arrays;

public class ArrayQueue<E> implements HtQueue<E> {

    HtArray<E> array;

    public ArrayQueue(int capacity) {
        array = new HtArray<>(capacity);
    }

    public ArrayQueue() {
        array = new HtArray<>();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void enqueue(E e) {
        array.addLast(e);
    }

    @Override
    public E dequeue() {
        return array.removeFirst();
    }

    @Override
    public E getFront() {
        return array.getFirst();
    }

    @Override
    public String toString() {
        E[] dataNew = (E[]) new Object[array.getSize()];
        for (int i = 0; i < array.getSize(); i++) {
            dataNew[i] = array.get(i);
        }

        return "ArrayQueue{" +
                "data=" + Arrays.toString(dataNew) +
                ", size=" + array.getSize() +
                ", capacity=" + array.getCapacity() +
                '}';
    }

    public static void main(String[] args) {
        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
            System.out.println(queue);

            if (i % 3 == 2) {
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
