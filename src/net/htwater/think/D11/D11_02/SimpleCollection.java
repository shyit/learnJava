package net.htwater.think.D11.D11_02;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by 96955 on 2019/3/18.
 */
public class SimpleCollection {

    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            c.add(i * i + 1);
        }
        for (int i : c) {
            System.out.println(i);
        }
    }

}
