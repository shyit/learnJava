package net.htwater.algorithmmuke.queue;

public interface HtQueue<E> {
    int getSize();

    boolean isEmpty();

    void enqueue(E e);

    E dequeue();

    E getFront();
}
