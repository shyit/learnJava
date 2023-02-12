package net.htwater.algorithmmuke.tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Bst<E extends Comparable<E>> {
    private class Node {
        public E e;
        public Node left;
        public Node right;

        public Node(E e) {
            this.e = e;
            left = null;
            right = null;
        }
    }

    private Node root;
    private int size;

    public Bst() {
        root = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void add(E e) {
        root = addNode(root, e);
    }

    private Node addNode(Node node, E e) {
        if (node == null) {
            size++;
            return new Node(e);
        }

        if (e.compareTo(node.e) == 0) {
            return node;
        } else if (e.compareTo(node.e) < 0) {
            node.left = addNode(node.left, e);
        } else {
            node.right = addNode(node.right, e);
        }

        return node;
    }

    public Boolean contains(E e) {
        return containsNode(root, e);
    }

    private Boolean containsNode(Node node, E e) {
        if (node == null) {
            return false;
        }

        if (e.compareTo(node.e) == 0) {
            return true;
        } else if (e.compareTo(node.e) < 0) {
            return containsNode(node.left, e);
        } else {
            return containsNode(node.right, e);
        }

    }

    public void preOrder() {
        preOrderNode(root);
    }

    private void preOrderNode(Node node) {
        if (node == null) {
            return;
        }

        System.out.println(node.e);

        preOrderNode(node.left);
        preOrderNode(node.right);
    }

    public void preOrderByStack() {
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            System.out.println(node.e);

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
    }

    public void levelOrderByQueue() {

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            Node node = queue.poll();
            System.out.println(node.e);

            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
        }
    }

    private void preOrderByStackNode(Node node) {
        if (node == null) {
            return;
        }

        System.out.println(node.e);

        preOrderNode(node.left);
        preOrderNode(node.right);
    }

    public void inOrder() {
        inOrderNode(root);
    }

    private void inOrderNode(Node node) {
        if (node == null) {
            return;
        }

        inOrderNode(node.left);
        System.out.println(node.e);
        inOrderNode(node.right);
    }

    public void postOrder() {
        postOrderNode(root);
    }

    private void postOrderNode(Node node) {
        if (node == null) {
            return;
        }

        postOrderNode(node.left);
        postOrderNode(node.right);
        System.out.println(node.e);
    }

    public E minimum() {
        if (root == null) {
            throw new RuntimeException("Bst is empty");
        }

        return minimumNode(root);
    }

    private E minimumNode(Node node) {
        if (node.left == null) {
            return node.e;
        }
        return minimumNode(node.left);
    }

    public E maximum() {
        if (root == null) {
            throw new RuntimeException("Bst is empty");
        }

        return maximumNode(root);
    }

    private E maximumNode(Node node) {
        if (root == null) {
            throw new RuntimeException("Bst is empty");
        }

        if (node.right == null) {
            return node.e;
        }
        return maximumNode(node.right);
    }

    public E deleteMinimum() {
        if (root == null) {
            throw new RuntimeException("Bst is empty");
        }

        E resultE = minimum();
        root = deleteMinimumNode(root);

        return resultE;
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

    public E deleteMaximum() {
        if (root == null) {
            throw new RuntimeException("Bst is empty");
        }

        E resultE = maximum();
        root = deleteMaximumNode(root);

        return resultE;
    }

    private Node deleteMaximumNode(Node node) {
        if (node.right == null) {
            Node leftNode = node.left;
            node.left = null;
            size--;
            return leftNode;
        } else {
            node.right = deleteMaximumNode(node.right);
            return node;
        }
    }

    public void delete(E e) {
        if (!contains(e)) {
            throw new RuntimeException("e not exist");
        }

        root = deleteNode(root, e);
    }

    private Node deleteNode(Node node, E e) {
        if (node == null) {
            return null;
        }

        if (node.e.compareTo(e) == 0) {
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
        }else if (e.compareTo(node.e) < 0) {
            node.left = deleteNode(node.left, e);
        } else if (e.compareTo(node.e) > 0) {
            node.right = deleteNode(node.right, e);
        }

        return node;
    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        generateBstString(root, 0, res);
        return res.toString();
    }

    private void generateBstString(Node node, int depth, StringBuilder res) {
        if (node == null) {
            res.append(generateDepthString(depth) + "null\n");
            return;
        }

        res.append(generateDepthString(depth) + node.e + "\n");

        generateBstString(node.left, depth + 1, res);
        generateBstString(node.right, depth + 1, res);
    }

    private String generateDepthString(int depth) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            res.append("--");
        }
        return res.toString();
    }


}
