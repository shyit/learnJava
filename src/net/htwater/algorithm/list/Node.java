package net.htwater.algorithm.list;

/**
 * Created by cambrian on 2019/4/15.
 */
public class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }

    public Node append(Node node){
        Node currentNode=this;
        Node nextNode=currentNode.next;

        while (null!=nextNode){
            currentNode=nextNode;
            nextNode=currentNode.next;
        }

        currentNode.next=node;

        return this;
    }

    public Node next(){
        return this.next;
    }

    public void show(){
        Node currentNode=this;
        while (null!=currentNode){
            System.out.print(currentNode.getData()+"  ");
            currentNode=currentNode.next;
        }
    }

    public void removeNext(){
        Node nextNextNode=this.next().next();
        this.next=nextNextNode;
    }

    public void insertNext(Node node){
        node.next=this.next;
        this.next=node;
    }

    public int getData() {
        return data;
    }

    public boolean isLast(){
        return this.next==null;
    }
}
