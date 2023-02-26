package net.htwater.algorithmmuke.unionfind;

public class UnionFindThree implements Uf {

    private int[] parent;
    private int[] sizes;

    public UnionFindThree(int size) {
        parent = new int[size];

        for (int i = 0; i < size; i++) {
            parent[i] = i;
            sizes[i] = 1;
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

        if (sizes[pRootId] <= sizes[qRootId]) {
            parent[pRootId] = qRootId;
            sizes[qRootId] += sizes[pRootId];
        } else {
            parent[qRootId] = pRootId;
            sizes[pRootId] += sizes[qRootId];
        }

    }
}
