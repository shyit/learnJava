package net.htwater.algorithmmuke.list;

import net.htwater.algorithmmuke.queue.HtQueue;

public class LinkedListQueue<E> implements HtQueue<E> {

    private Node headNode;

    private Node tailNode;

    private int size;

    public LinkedListQueue() {
        headNode = null;
        tailNode = null;
        size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void enqueue(E e) {
        Node node = new Node(e);

        if (tailNode == null) {
            tailNode = node;
            headNode = node;
        } else {
            tailNode.next = node;
            tailNode = node;
        }

        size++;
    }

    @Override
    public E dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("dequeue queue is empty");
        }

        Node resultNode = headNode;
        headNode = headNode.next;
        resultNode.next = null;

        if (headNode == null) {
            tailNode = null;
        }

        size--;

        return resultNode.e;
    }

    @Override
    public E getFront() {
        if (isEmpty()) {
            throw new RuntimeException("getFront queue is empty");
        }

        return headNode.e;
    }

    @Override
    public String toString() {

        StringBuilder stringBuilder = new StringBuilder();
        Node currentNode = headNode;
        while (currentNode != null) {
            stringBuilder.append(currentNode + "->");
            currentNode = currentNode.next;
        }
        stringBuilder.append("NULL");

        return "LinkedListQueue{" +
                "headNode=" + headNode +
                ", tailNode=" + tailNode +
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
