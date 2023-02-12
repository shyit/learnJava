package net.htwater.algorithmmuke.set;

import net.htwater.algorithmmuke.tree.Bst;

public class BstSet<E extends Comparable<E>> implements Set<E>{

    private Bst<E> bst;

    public BstSet() {
        this.bst = new Bst<>();
    }

    @Override
    public void add(E e) {
        bst.add(e);
    }

    @Override
    public void remove(E e) {
        bst.delete(e);
    }

    @Override
    public boolean contains(E e) {
        return bst.contains(e);
    }

    @Override
    public int getSize() {
        return bst.size();
    }
}
