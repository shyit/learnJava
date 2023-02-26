package net.htwater.algorithmmuke.unionfind;

public interface Uf {
    int getSize();

    boolean isConnected(int p, int q);

    void unionElements(int p, int q);
}
