package net.htwater.algorithm.listsecond;

public class DoubleNodeTest {
    public static void main(String[] args) {
        DoubleNode doubleNode1 = new DoubleNode(11);
        DoubleNode doubleNode2 = new DoubleNode(22);
        DoubleNode doubleNode3 = new DoubleNode(33);
        DoubleNode doubleNode4 = new DoubleNode(44);

        doubleNode1.after(doubleNode2);
        doubleNode2.after(doubleNode3);
        doubleNode3.after(doubleNode4);

        System.out.println(doubleNode1.data);
        System.out.println(doubleNode1.next.data);
        System.out.println(doubleNode1.next.next.data);
        System.out.println(doubleNode1.next.next.next.data);
        System.out.println(doubleNode1.next.next.next.next.data);
        System.out.println(doubleNode1.next.next.next.next.next.data);
        System.out.println(doubleNode1.next.next.next.next.next.next.data);
        System.out.println(doubleNode1.next.next.next.next.next.next.next.data);
        System.out.println(doubleNode1.next.next.next.next.next.next.next.next.data);
        System.out.println(doubleNode1.next.next.next.next.next.next.next.next.next.data);
    }
}
