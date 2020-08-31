package net.htwater.datastructures;

import java.util.Arrays;

public class CamArray {
    private int[] data;
    private int size;

    //构造函数，传入数组的容量capacity构造CamArray
    public CamArray(int capacity) {
        data=new int[capacity];
    }

    //无参数的构造函数，默认数组的容量capacity=10
    public CamArray() {
        this(10);
    }

    //获取数组中的元素个数
    public int getSize() {
        return size;
    }

    //获取数组中的容量
    public int getCapacity(){
        return data.length;
    }

    //向所有元素后添加一个新元素
    public void addLast(int element){
        add(size,element);
    }

    //向所有元素前添加一个新元素
    public void addFirst(int element){
        add(0,element);
    }


    //在第index个位置插入一个新元素element
    public void add(int index,int element){
        if (size==data.length){
            throw new IllegalArgumentException("add failed. Array is full.");
        }

        if (index<0||index>size){
            throw new IllegalArgumentException("add failed. Require index >=0 and index <size.");
        }

        for (int i = size-1; i >=index; i--) {
            data[i+1]=data[i];
        }

        data[index]=element;

        size++;
    }

    //获取index索引位置的元素
    public int get(int index){
        if (index<0||index>size){
            throw new IllegalArgumentException("add failed. Require index >=0 and index <size.");
        }
        return data[index];
    }

    //获取index索引位置的元素
    public void set(int index,int element){
        if (index<0||index>size){
            throw new IllegalArgumentException("add failed. Require index >=0 and index <size.");
        }
        data[index]=element;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("Array: size = "+size+", capacity = "+data.length+"\n");
        stringBuilder.append("[");
        for (int i = 0; i < size; i++) {
            stringBuilder.append(data[i]);
            if (i!=size-1){
                stringBuilder.append(", ");
            }
        }
        stringBuilder.append("]");

        return stringBuilder.toString();
    }
}
