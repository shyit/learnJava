package net.htwater.algorithm.base;

public class Node {
    //节点内容
    int data;

    //下一个节点
    Node next;

    public Node(int data) {
        this.data = data;
    }

    //为节点追加节点
    public Node append(Node nextNode){
        Node nodeTemp=this;
        while (true){
            if (null==nodeTemp.next){
                break;
            }else {
                nodeTemp=nodeTemp.next;
            }
        }
        nodeTemp.next=nextNode;

        return this;
    }

    //获取下一个节点
    public Node next(){
        return this.next;
    }

    //判断是否 最后一个节点
    public boolean checkLastBoolean(){
        return null==this.next;
    }

}
