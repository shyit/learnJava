package net.htwater.think.D11.D11_08;

import java.util.*;

/**
 * Created by 96955 on 2019/4/22.
 */
public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Random random = new Random(47);

        for (int i = 0; i < 10; i++) {
            queue.offer(random.nextInt(i+10));
        }

        printQ(queue);

        Queue<String> queueStr=new LinkedList<>();
        for(String str:"a bb ccc dd e hello world".split(" ")){
            queueStr.offer(str);
        }

        printQ(queueStr);

    }

    public static void printQ(Queue queue) {
        while (queue.peek()!=null){
            System.out.print(queue.remove()+"  ");
        }

        System.out.println();
    }
}
