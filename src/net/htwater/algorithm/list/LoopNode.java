package net.htwater.algorithm.list;

/**
 * Created by cambrian on 2019/4/15.
 */
public class LoopNode {
    int data;
    LoopNode next=this;

    public LoopNode(int data) {
        this.data = data;
    }


    public LoopNode next(){
        return this.next;
    }

    public void removeNext(){
        LoopNode nextNextNode=this.next().next();
        this.next=nextNextNode;
    }

    public void insertNext(LoopNode node){
        node.next=this.next;
        this.next=node;
    }

    public int getData() {
        return data;
    }

}
