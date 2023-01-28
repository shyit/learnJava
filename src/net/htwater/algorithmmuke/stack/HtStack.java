package net.htwater.algorithmmuke.stack;

public interface HtStack<E> {

    int getSize();

    boolean isEmpty();

    void push(E e);

    E pop();

    E peek();
}
