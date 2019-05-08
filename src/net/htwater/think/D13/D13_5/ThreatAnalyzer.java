package net.htwater.think.D13.D13_5;

import java.util.Scanner;

/**
 * Created by 96955 on 2019/5/8.
 */
public class ThreatAnalyzer {
    private static String threatData="28.27.161@02/10/2005\n204.27.81@02/11/2005\n" +
            "58.27.82@02/11/2005\n[next log section with different data format]";

    public static void main(String[] args){
        Scanner scanner=new Scanner(threatData);
        String pattern="(\\d+[.]\\d+[.]\\d+)@(\\d+/\\d+/\\d+)";
        while (scanner.hasNext(pattern)){
            System.out.println(scanner.next(pattern));
        }
    }
}
