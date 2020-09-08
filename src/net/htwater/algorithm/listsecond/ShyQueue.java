package net.htwater.algorithm.listsecond;

public class ShyQueue {
    int[] elements;

    public ShyQueue() {
        elements=new int[0];
    }

    //展示栈
    public void show(){
        System.out.print("[");
        for (int i = 0; i < elements.length-1; i++) {
            System.out.print(elements[i]+", ");
        }
        if (elements.length>0){
            System.out.print(elements[elements.length-1]);
        }

        System.out.print("]");

        System.out.println();
    }


    //添加数据
    public void add(int value){
        int[] elementsTemp=new int[elements.length+1];
        for (int i = 0; i < elements.length; i++) {
            elementsTemp[i]=elements[i];
        }

        elementsTemp[elementsTemp.length-1]=value;

        elements=elementsTemp;
    }

    //取出数据
    public int poll(){
        if (elements.length==0){
            throw new RuntimeException("当前栈为空");
        }

        int value=elements[0];

        int[] elementsTemp=new int[elements.length-1];
        for (int i = 0; i < elementsTemp.length; i++) {
            elementsTemp[i]=elements[i+1];
        }

        elements=elementsTemp;

        return value;
    }

    public boolean getEmptyStatus(){
        return elements.length==0;
    }
}
