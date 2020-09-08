package net.htwater.algorithm.listsecond;

public class DoubleNode {
    //上一个节点
    DoubleNode pre =this;

    //下一个节点
    DoubleNode next=this;

    //节点数据
    int data;

    public DoubleNode(int data) {
        this.data = data;
    }

    //增加节点
    public void after(DoubleNode node){
        DoubleNode nextNode=this.next;

        node.pre=this;
        node.next=nextNode;

        nextNode.pre=node;
        this.next=node;
    }

    //下一个节点
    public DoubleNode getNext(){
        return this.next;
    }

    //上一个节点
    public DoubleNode getPre(){
        return this.pre;
    }
}
