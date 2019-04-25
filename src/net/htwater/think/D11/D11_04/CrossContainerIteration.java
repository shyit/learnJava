package net.htwater.think.D11.D11_04;

import java.util.*;

/**
 * Created by 96955 on 2019/4/12.
 */
public class CrossContainerIteration {

    public static void display(Iterator iterator){
        while (iterator.hasNext()){
            System.out.print(iterator.next()+"  ");
        }
    }

    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.add("a");
        strs.add("bb");
        strs.add("ccc");
        strs.add("D");
        strs.add("EE");
        strs.add("FFF");

        display(strs.iterator());
        System.out.println();

        List<Double> doubles=new LinkedList<>();
        doubles.add(0.11);
        doubles.add(0.111);
        doubles.add(0.1111);
        doubles.add(1.1);
        doubles.add(11.1);
        doubles.add(111.1);

        display(doubles.iterator());
        System.out.println();

        HashSet<Integer> integers=new HashSet<>();
        integers.add(1);
        integers.add(12);
        integers.add(13);
        integers.add(14);
        integers.add(15);
        integers.add(12);
        integers.add(17);

        display(integers.iterator());
        System.out.println();

        TreeSet<Boolean> booleans=new TreeSet<>();
        booleans.add(true);
        booleans.add(false);
        booleans.add(false);
        booleans.add(true);
        booleans.add(true);
        booleans.add(true);
        booleans.add(true);

        display(booleans.iterator());
        System.out.println();

    }
}
