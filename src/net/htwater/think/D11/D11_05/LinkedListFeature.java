package net.htwater.think.D11.D11_05;

import java.util.LinkedList;

/**
 * Created by 96955 on 2019/4/16.
 */
public class LinkedListFeature {
    public static void main(String[] args) {
        LinkedList<String> strLinkedList=new LinkedList<>();
        strLinkedList.add("a");
        strLinkedList.add("b");
        strLinkedList.add("c");
        strLinkedList.add("d");

        System.out.println(strLinkedList);

        strLinkedList.add("00");
        System.out.println(strLinkedList);

        strLinkedList.addFirst("11");
        System.out.println(strLinkedList);

        strLinkedList.addLast("12");
        System.out.println(strLinkedList);

        strLinkedList.offer("22");
        System.out.println(strLinkedList);

        strLinkedList.offerFirst("33");
        System.out.println(strLinkedList);

        strLinkedList.offerLast("44");
        System.out.println(strLinkedList);
    }
}
