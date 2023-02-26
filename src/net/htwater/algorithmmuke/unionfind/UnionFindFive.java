package net.htwater.algorithmmuke.unionfind;

public class UnionFindFive implements Uf {

    private int[] parent;
    private int[] rank;

    public UnionFindFive(int size) {
        parent = new int[size];

        for (int i = 0; i < size; i++) {
            parent[i] = i;
            rank[i] = 1;
        }
    }

    @Override
    public int getSize() {
        return parent.length;
    }

    public int find(int p) {
        if (p < 0 || p >= parent.length) {
            throw new RuntimeException("p is out of bound.");
        }

        while (p != parent[p]) {
            parent[p] = parent[parent[p]];
            p = parent[p];
        }

        return p;
    }

    @Override
    public boolean isConnected(int p, int q) {
        int pRootId = find(p);
        int qRootId = find(q);
        return pRootId == qRootId;
    }

    @Override
    public void unionElements(int p, int q) {
        int pRootId = find(p);
        int qRootId = find(q);
        if (pRootId == qRootId) {
            return;
        }

        if (rank[pRootId] < rank[qRootId]) {
            parent[pRootId] = qRootId;
        } else if (rank[pRootId] > rank[qRootId]) {
            parent[qRootId] = pRootId;
        } else {
            parent[qRootId] = pRootId;
            rank[pRootId]++;
        }

        parent[q] = pRootId;
    }
}
