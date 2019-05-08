package net.htwater.think.D13.D13_5;

import java.util.Scanner;

/**
 * Created by 96955 on 2019/5/8.
 */
public class ScannerDelimiter {
    public static void main(String[] args){
        Scanner scanner=new Scanner("12, 42, 78, 99,42" );
//        scanner.useDelimiter("\\s*,\\s*");
        scanner.useDelimiter(",");

        while (scanner.hasNext()){
            System.out.println(scanner.next());
        }

    }
}
