package net.htwater.algorithm.list;

/**
 * Created by cambrian on 2019/4/15.
 */
public class NodeTest {

    public static void main(String[] args){
        Node node1=new Node(1);
        Node node2=new Node(2);
        Node node3=new Node(33);
        Node node4=new Node(444);

        node1.append(node2).append(node3).append(node4);

        node1.show();

        node2.removeNext();

        System.out.println();

        node1.show();

        System.out.println();

        Node newNode=new Node(123);
        node1.insertNext(newNode);

        node1.show();
    }
}
