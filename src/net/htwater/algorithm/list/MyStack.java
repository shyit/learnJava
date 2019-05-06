package net.htwater.algorithm.list;

/**
 * Created by cambrian on 2019/4/14.
 */
public class MyStack {
    int[] elements;

    public MyStack() {
        elements = new int[0];
    }

    public void push(int element) {
        int[] newArray = new int[elements.length + 1];
        for (int i = 0; i < elements.length; i++) {
            newArray[i] = elements[i];
        }
        newArray[newArray.length - 1] = element;

        elements = newArray;
    }

    public int pop() {
        if (elements.length==0){
            throw new RuntimeException("栈是空的");
        }

        int value=elements[elements.length - 1];

        int[] newArray = new int[elements.length -1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = elements[i];
        }

        elements = newArray;

        return value;
    }

    public int peek(){
        return elements[elements.length - 1];
    }

    public boolean isEmpty(){
        return elements.length==0;
    }
}
