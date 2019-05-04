package net.htwater.algorithm.list;

/**
 * Created by cambrian on 2019/4/16.
 */
public class DoubleLoopNode {
    int data;
    DoubleLoopNode preDoubleLoopNode=this;
    DoubleLoopNode nextDoubleLoopNode=this;

    public DoubleLoopNode(int data) {
        this.data = data;
    }

    public void after(DoubleLoopNode doubleLoopNode){
        doubleLoopNode.nextDoubleLoopNode=this.nextDoubleLoopNode;
        doubleLoopNode.nextDoubleLoopNode.preDoubleLoopNode=doubleLoopNode;
        this.nextDoubleLoopNode=doubleLoopNode;

        doubleLoopNode.preDoubleLoopNode=this;
    }

    public DoubleLoopNode next(){
        return this.nextDoubleLoopNode;
    }

    public DoubleLoopNode pre(){
        return this.preDoubleLoopNode;
    }

    public int getData(){
        return this.data;
    }
}
