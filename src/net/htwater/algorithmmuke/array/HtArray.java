package net.htwater.algorithmmuke.array;

import java.util.Arrays;

public class HtArray<E> {
    private E[] data;

    private int size;

    public HtArray(int capacity) {
        data = (E[]) new Object[capacity];
        size = 0;
    }

    public HtArray() {
        this(0);
    }

    public E[] getData() {
        return data;
    }

    public void setData(E[] data) {
        this.data = data;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getCapacity() {
        return data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addLast(E element) {

        if (size == data.length) {
            resize(data.length * 2);
        }

        if (size == data.length) {
            E[] dataNew = (E[]) new Object[data.length + 1];
            for (int i = 0; i < data.length; i++) {
                dataNew[i] = data[i];
            }
            dataNew[data.length] = element;
            data = dataNew;
        } else {
            data[size] = element;
        }

        size++;
    }


    public void insert(int index, E element) {
        if (index < 0 || index > size) {
            throw new RuntimeException("HtArray insert越界");
        }

        if (size == data.length) {
            resize(data.length * 2);
        }

        if (size == data.length) {
            E[] dataNew = (E[]) new Object[data.length + 1];
            for (int i = 0; i < data.length; i++) {
                dataNew[i] = data[i];
            }
            for (int i = dataNew.length - 1; i >= 0; i--) {
                if (i > index) {
                    dataNew[i] = dataNew[i - 1];
                }
            }
            dataNew[index] = element;
            data = dataNew;
        } else {
            for (int i = size; i >= 0; i--) {
                if (i > index) {
                    data[i] = data[i - 1];
                }
            }
            data[index] = element;
        }

        size++;
    }

    public E get(int index) {
        if (index < 0 || index > size) {
            throw new RuntimeException("HtArray get越界");
        }
        return data[index];
    }

    public E getLast() {
        return get(size - 1);
    }

    public E getFirst() {
        return get(0);
    }

    public void set(int index, E element) {
        if (index < 0 || index > size) {
            throw new RuntimeException("HtArray set越界");
        }
        data[index] = element;
    }

    public boolean contains(E element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    public int find(E element) {
        for (int i = 0; i < size; i++) {
            if (data[i].equals(element)) {
                return i;
            }
        }
        return -1;
    }

    public E remove(int index) {
        if (index < 0 || index > size) {
            throw new RuntimeException("HtArray delete越界");
        }

        E ret = data[index];

        for (int i = 0; i < size - 1; i++) {
            if (i >= index) {
                data[i] = data[i + 1];
            }
        }
        data[size - 1] = null;
        size--;

        if (size == data.length / 2) {
            resize(data.length / 2);
        }

        return ret;
    }

    public E removeLast() {
        return this.remove(size - 1);
    }

    public E removeFirst() {
        return this.remove(0);
    }

    public void removeElement(E element) {
        int index = this.find(element);
        if (index >= 0) {
            this.remove(index);
        }
    }

    private void resize(int newCapacity) {
        E[] dataNew = (E[]) new Object[newCapacity];
        for (int i = 0; i < data.length && i < dataNew.length; i++) {
            dataNew[i] = data[i];
        }
        data = dataNew;
    }


    @Override
    public String toString() {
        E[] dataNew = (E[]) new Object[size];
        for (int i = 0; i < size; i++) {
            dataNew[i] = data[i];
        }

        return "HtArray{" +
                "data=" + Arrays.toString(dataNew) +
                ", size=" + size +
                ", capacity=" + data.length +
                '}';
    }
}
