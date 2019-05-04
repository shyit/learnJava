package net.htwater.algorithm.list;

/**
 * Created by cambrian on 2019/4/14.
 */
public class MyQueue {
    int[] elements;

    public MyQueue(){
        elements=new int[0];
    }

    public void add(int element){
        int[] newArray = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
        newArray[newArray.length - 1] = element;

        elements = newArray;
    }

    public int pull(){
        int element=elements[0];

        int[] newArray = new int[elements.length -1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = elements[i+1];
        }

        elements = newArray;

        return element;
    }

    public boolean isEmpty(){
        return elements.length==0;
    }
}
