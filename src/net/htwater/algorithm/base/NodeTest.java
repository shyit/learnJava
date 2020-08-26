package net.htwater.algorithm.base;

public class NodeTest {
    public static void main(String[] args) {
        Node node1=new Node(11);
        Node node2=new Node(22);
        Node node3=new Node(33);
        Node node4=new Node(44);

        System.out.println(node1.checkLastBoolean());

        node1.append(node4).append(node3).append(node2);
        System.out.println(node1.checkLastBoolean());
        System.out.println(node2.checkLastBoolean());

        System.out.println(node1.data);
        System.out.println(node1.next.data);
        System.out.println(node1.next.next.data);
        System.out.println(node1.next.next.next.data);
    }
}
