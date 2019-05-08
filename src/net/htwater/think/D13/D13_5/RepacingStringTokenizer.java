package net.htwater.think.D13.D13_5;

import java.util.StringTokenizer;

/**
 * Created by 96955 on 2019/5/8.
 */
public class RepacingStringTokenizer {
    public static void main(String[] args) {
        String input="But I'm not dead yet! I feel happy";
        StringTokenizer stringTokenizer=new StringTokenizer(input);
        while (stringTokenizer.hasMoreElements()){
            System.out.print(stringTokenizer.nextToken()+" + ");
        }
    }
}
