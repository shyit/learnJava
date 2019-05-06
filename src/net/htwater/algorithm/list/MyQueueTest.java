package net.htwater.algorithm.list;

/**
 * Created by cambrian on 2019/4/14.
 */
public class MyQueueTest {

    public static void main(String[] args){
        MyQueue myQueue=new MyQueue();

        myQueue.add(1111);
        myQueue.add(222);
        myQueue.add(33);
        myQueue.add(4);

        System.out.println(myQueue.isEmpty());

        System.out.println(myQueue.pull());
        System.out.println(myQueue.pull());
        myQueue.add(50);
        System.out.println(myQueue.pull());
        System.out.println(myQueue.pull());
        System.out.println(myQueue.pull());
        
        System.out.println(myQueue.isEmpty());

    }
}
