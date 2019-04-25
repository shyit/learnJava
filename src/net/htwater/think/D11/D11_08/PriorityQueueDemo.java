package net.htwater.think.D11.D11_08;

import java.util.*;

import static net.htwater.think.D11.D11_08.QueueDemo.printQ;

/**
 * Created by 96955 on 2019/4/22.
 */
public class PriorityQueueDemo {
    public static void main(String[] args) {
        String str= "Hello my name is Cambrian The 1st.";
        List<String> strList= Arrays.asList(str.split(" "));

        PriorityQueue<String> priorityQueue=new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.addAll(strList);

        printQ(priorityQueue);
    }

}
