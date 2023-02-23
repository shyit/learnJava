package net.htwater.algorithmmuke.trie;

import java.util.TreeMap;

public class LeetCode677WordDictionary {

    private class Node {
        public int value;
        public TreeMap<Character, Node> next;

        public Node(int value) {
            this.value = value;
            next = new TreeMap<>();
        }

        public Node() {
            this(0);
        }
    }


    private Node root;

    public LeetCode677WordDictionary() {
        root = new Node();
    }

    public void insert(String key, int val) {
        Node cur = root;
        for (int i = 0; i < key.length(); i++) {
            char c = key.charAt(i);
            if (cur.next.get(c) == null) {
                cur.next.put(c, new Node());
            }
            cur = cur.next.get(c);
        }

        cur.value = val;
    }

    public int sum(String prefix) {
        Node cur = root;
        for (int i = 0; i < prefix.length(); i++) {
            char c = prefix.charAt(i);
            if (cur.next.get(c) == null) {
                return 0;
            }
            cur = cur.next.get(c);
        }

        return sumValue(cur);
    }

    private int sumValue(Node cur) {
        int sum = cur.value;
        for (char nextChar : cur.next.keySet()) {
            Node nextNode = cur.next.get(nextChar);
            sum += sumValue(nextNode);
        }
        return sum;
    }
}
