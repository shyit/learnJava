package net.htwater.think.P156;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by 96955 on 2019/1/8.
 */
public class FieldAccess {

    public static void main(String[] args) {
        String[] strs = {"a", "b", "c"};
        System.out.println(Arrays.toString(strs));

        List<String> arr = Arrays.asList(strs);
//        arr.add(0, "z"); 报错：Exception in thread "main" java.lang.UnsupportedOperationException

        List brr = new ArrayList(arr);
        brr.add(0, "z");
        String[] b = (String[]) brr.toArray(new String[4]);
        System.out.println(Arrays.toString(b));
    }

}
