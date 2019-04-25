package net.htwater.think.D11.D11_03;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 96955 on 2019/4/10.
 */
public class mList {
    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            strs.add(100 - (i * i + 1) + "");
        }

        List<String> subList = strs.subList(3, 5);

        System.out.println(strs);
        System.out.println(subList);

        subList.set(1,"123");

        System.out.println(strs);
        System.out.println(subList);

    }
}
