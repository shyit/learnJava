package net.htwater.think.D11.D11_06;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by 96955 on 2019/4/17.
 */
public class SetOperations {
    public static void main(String[] args){
        Set<String> set=new HashSet<>();
        Collections.addAll(set,"a b c d e f g h i".split(" "));

        Set<String> set2=new HashSet<>();
        Collections.addAll(set2,"g h i".split(" "));

        System.out.println(set);
        System.out.println(set2);

        System.out.println(set.containsAll(set2));

        set.remove("h");

        System.out.println(set);
        System.out.println(set2);

        System.out.println(set.containsAll(set2));
    }
}
