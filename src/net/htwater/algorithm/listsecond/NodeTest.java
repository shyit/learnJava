package net.htwater.algorithm.listsecond;

public class NodeTest {
    public static void main(String[] args) {
        Node node1=new Node(11);
        Node node2=new Node(22);
        Node node3=new Node(33);
        Node node4=new Node(44);

        node1.append(node2).append(node3).append(node4);

//        System.out.println(node1);
//        System.out.println(node1.next);
//        System.out.println(node1.next.next);
//        System.out.println(node1.next.next.next);
//        System.out.println("========");
//        node1.removeNext();
//        System.out.println(node1);
//        System.out.println(node1.next);
//        System.out.println(node1.next.next);
//        System.out.println(node1.next.next.next);
        node1.show();

        node1.after(new Node(15));
        node1.show();

        node4.after(new Node(45));
        node1.show();
    }
}
