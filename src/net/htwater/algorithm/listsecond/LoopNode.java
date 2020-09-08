package net.htwater.algorithm.listsecond;

public class LoopNode {
    //节点内容
    int data;

    //下一个节点
    LoopNode next=this;

    public LoopNode(int data) {
        this.data = data;
    }


    //获取下一个节点
    public LoopNode next(){
        return this.next;
    }


    //删除下一个节点
    public void removeNext(){
        this.next=this.next.next;
//        if (this.next==this){
//            this=null;
//        }else {
//
//        }
    }

    //插入节点
    public void after(LoopNode node){
        node.next=this.next;
        this.next=node;
    }

}
