package net.htwater.algorithm.list;

/**
 * Created by cambrian on 2019/4/14.
 */
public class MyStackTest {
    public static void main(String[] args){
        MyStack myStack=new MyStack();

//        System.out.println(myStack.pop());

        System.out.println(myStack.isEmpty());

        myStack.push(1);
        myStack.push(22);
        myStack.push(333);

        System.out.println(myStack.isEmpty());

        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

        System.out.println(myStack.isEmpty());
    }
}
