package net.htwater.algorithm.list;

/**
 * Created by cambrian on 2019/4/15.
 */
public class LoopNodeTest {

    public static void main(String[] args){
        LoopNode loopNode1=new LoopNode(1);
        LoopNode loopNode2=new LoopNode(2);
        LoopNode loopNode3=new LoopNode(3);
        LoopNode loopNode4=new LoopNode(4);

        loopNode1.insertNext(loopNode2);
        loopNode2.insertNext(loopNode3);
        loopNode3.insertNext(loopNode4);

        System.out.println(loopNode1.getData());
        System.out.println(loopNode1.next().getData());
        System.out.println(loopNode1.next().next().getData());
        System.out.println(loopNode1.next().next().next().getData());
        System.out.println(loopNode1.next().next().next().next().getData());
    }
}
