package net.htwater.algorithm.listsecond;

public class LoopNodeTest {
    public static void main(String[] args) {
        LoopNode loopNode1=new LoopNode(11);
        LoopNode loopNode2=new LoopNode(22);
        LoopNode loopNode3=new LoopNode(33);
        LoopNode loopNode4=new LoopNode(44);

        loopNode1.after(loopNode2);
        loopNode2.after(loopNode3);
        loopNode3.after(loopNode4);

        System.out.println(loopNode1.data);
        System.out.println(loopNode1.next.data);
        System.out.println(loopNode1.next.next.data);
        System.out.println(loopNode1.next.next.next.data);
        System.out.println(loopNode1.next.next.next.next.data);


    }
}
