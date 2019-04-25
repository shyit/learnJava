package net.htwater.think.D11.D11_02;

import java.util.*;

/**
 * Created by 96955 on 2019/4/3.
 */
public class AddingGroup {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        list.add(11);
        list.add(22);
        for (int i : list) {
            System.out.println(i);
        }
    }
}
