package net.htwater.algorithm.list;

/**
 * Created by cambrian on 2019/4/16.
 */
public class DoubleLoopNodeTest {
    public static void main(String[] args){
        DoubleLoopNode doubleLoopNode1=new DoubleLoopNode(11);
        DoubleLoopNode doubleLoopNode2=new DoubleLoopNode(22);
        DoubleLoopNode doubleLoopNode3=new DoubleLoopNode(33);

        System.out.println(doubleLoopNode1.getData());
        System.out.println(doubleLoopNode1.next().getData());
        System.out.println(doubleLoopNode1.pre().getData());

        doubleLoopNode1.after(doubleLoopNode2);

        System.out.println(doubleLoopNode1.getData());
        System.out.println(doubleLoopNode1.next().getData());
        System.out.println(doubleLoopNode1.pre().getData());

        doubleLoopNode2.after(doubleLoopNode3);

        System.out.println(doubleLoopNode1.getData());
        System.out.println(doubleLoopNode1.next().getData());
        System.out.println(doubleLoopNode1.pre().getData());
    }
}
