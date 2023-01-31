package net.htwater.algorithmmuke.list;

public class LinkedList<E> {

    private Node dummyHead;

    private int size;

    public LinkedList() {
        dummyHead = new Node(null, null);
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(E e) {
        add(0, e);
    }

    public void addLast(E e) {
        add(size, e);
    }

    public void add(int index, E e) {
        if (index < 0 || index > size) {
            throw new RuntimeException("index error");
        } else {
            Node prev = dummyHead;
            for (int i = 0; i < index; i++) {
                prev = prev.next;
            }

            prev.next = new Node(e, prev.next);
        }

        size++;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("index error");
        }

        Node node = dummyHead;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node.e;
    }

    public E getFirst() {
        return get(0);
    }

    public E getLast() {
        return get(size - 1);
    }

    public void set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("set index error");
        }

        Node currentNode = dummyHead.next;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        currentNode.e = e;
    }

    public boolean contains(E e) {
        Node currentNode = dummyHead;
        while (currentNode.e != null) {
            if (currentNode.e.equals(e)) {
                return true;
            }
            currentNode = currentNode.next;
        }
        return false;
    }

    public E remove(int index) {
        if (index < 0 || index >= size) {
            throw new RuntimeException("remove index error");
        }

        Node prev = dummyHead;
        for (int i = 0; i < index; i++) {
            prev = prev.next;
        }

        Node resultNode = prev.next;

        prev.next = prev.next.next;

        resultNode.next = null;

        size--;

        return resultNode.e;
    }

    public E removeFirst() {
        return remove(0);
    }

    public E removeLast() {
        return remove(size-1);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node currentNode = dummyHead.next;
        while (currentNode != null) {
            stringBuilder.append(currentNode + "->");
            currentNode = currentNode.next;
        }
        stringBuilder.append("NULL");

        return "LinkedList{" +
                "dummyHead=" + dummyHead +
                ", size=" + size +
                ", data=" + stringBuilder +
                '}';
    }

    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e + "";
        }
    }
}
