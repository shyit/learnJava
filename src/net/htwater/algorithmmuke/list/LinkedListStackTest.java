package net.htwater.algorithmmuke.list;

public class LinkedListStackTest {
    public static void main(String[] args) {
        LinkedListStack<Integer> linkedListStack = new LinkedListStack<>();

        for (int i = 0; i < 10; i++) {
            linkedListStack.push(i);
        }
        System.out.println(linkedListStack);

        linkedListStack.pop();
        System.out.println(linkedListStack);

        linkedListStack.pop();
        System.out.println(linkedListStack);

        linkedListStack.peek();
        System.out.println(linkedListStack);

        linkedListStack.peek();
        System.out.println(linkedListStack);
    }
}
