package net.htwater.algorithmmuke.set;

import net.htwater.algorithmmuke.array.HtArray;
import net.htwater.algorithmmuke.list.LinkedList;

public class LinkedListSet<E extends Comparable<E>> implements Set<E> {

    private HtArray<E> list;

    public LinkedListSet() {
        list = new HtArray<>();
    }

    @Override
    public void add(E e) {
        if (!list.contains(e)) {
            list.addLast(e);
        }
    }

    @Override
    public void remove(E e) {
        list.removeElement(e);
    }

    @Override
    public boolean contains(E e) {
        return list.contains(e);
    }

    @Override
    public int getSize() {
        return list.getSize();
    }
}
