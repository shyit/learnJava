package net.htwater.algorithmmuke.stack;

import net.htwater.algorithmmuke.array.HtArray;

import java.util.Arrays;

public class ArrayStack<E> implements HtStack<E> {

    HtArray<E> array;

    public ArrayStack(int capacity) {
        array = new HtArray<>(capacity);
    }

    public ArrayStack() {
        array = new HtArray<>();
    }

    @Override
    public int getSize() {
        return array.getSize();
    }

    public int getCapacity() {
        return array.getCapacity();
    }

    @Override
    public boolean isEmpty() {
        return array.isEmpty();
    }

    @Override
    public void push(E e) {
        array.addLast(e);
    }

    @Override
    public E pop() {
        return array.removeLast();
    }

    @Override
    public E peek() {
        return array.get(array.getSize()-1);
    }

    @Override
    public String toString() {
        E[] dataNew = (E[]) new Object[array.getSize()];
        for (int i = 0; i < array.getSize(); i++) {
            dataNew[i] = array.get(i);
        }

        return "ArrayStack{" +
                "data=" + Arrays.toString(dataNew) +
                ", size=" + array.getSize() +
                ", capacity=" + array.getCapacity() +
                '}';
    }
}

