package net.htwater.algorithmmuke.map;


import net.htwater.algorithmmuke.tree.Bst;

public class BstMap<K extends Comparable<K>, V> implements Map<K, V> {
    private class Node {
        public K key;
        public V value;
        public Node left;
        public Node right;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;


    @Override
    public void add(K key, V value) {
        root = addNode(root, key, value);
    }


    private Node addNode(Node node, K key, V value) {
        if (node == null) {
            size++;
            return new Node(key, value);
        }

        if (key.compareTo(node.key) == 0) {
            node.value = value;
        } else if (key.compareTo(node.key) < 0) {
            node.left = addNode(node.left, key, value);
        } else {
            node.right = addNode(node.right, key, value);
        }

        return node;
    }

    private Node getNode(Node node, K key) {
        if (node == null) {
            return null;
        } else if (key.compareTo(node.key) == 0) {
            return node;
        } else if (key.compareTo(node.key) < 0) {
            return getNode(node.left, key);
        } else {
            return getNode(node.right, key);
        }
    }

    @Override
    public V remove(K key) {
        Node node = getNode(root, key);

        if (node == null) {
            throw new RuntimeException("key is not exist");
        }

        root = deleteNode(root, key);

        return node.value;
    }


    private Node deleteNode(Node node, K key) {
        if (node == null) {
            return null;
        }

        if (node.key.compareTo(key) == 0) {
            if (node.left == null) {
                node = node.right;
            } else if (node.right == null) {
                node = node.left;
            } else {
                Node nodeTemp = deleteMinimumNode(node.right);
                nodeTemp.left=node.left;
                nodeTemp.right = node.right;

                node = nodeTemp;
            }

            return node;
        }else if (key.compareTo(node.key) < 0) {
            node.left = deleteNode(node.left, key);
        } else if (key.compareTo(node.key) > 0) {
            node.right = deleteNode(node.right, key);
        }

        return node;
    }

    private Node deleteMinimumNode(Node node) {
        if (node.left == null) {
            Node rightNode = node.right;
            node.right = null;
            size--;
            return rightNode;
        } else {
            node.left = deleteMinimumNode(node.left);
            return node;
        }
    }

    @Override
    public boolean contains(K key) {
        Node node = getNode(root, key);
        return node != null;
    }

    @Override
    public V get(K key) {
        Node node = getNode(root, key);
        if (node == null) {
            return null;
        } else {
            return node.value;
        }
    }

    @Override
    public void set(K key, V newValue) {
        Node node = getNode(root, key);
        if (node == null) {
            throw new RuntimeException("key is not exist");
        } else {
            node.value = newValue;
        }
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }
}
