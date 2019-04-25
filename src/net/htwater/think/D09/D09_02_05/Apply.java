package net.htwater.think.D09.D09_02_05;

/**
 * Created by 96955 on 2019/2/15.
 */
public class Apply {

    public static void process(Processor processor, Object object) {
        System.out.println("Using Processor" + processor.name());
        System.out.println(processor.process(object));
    }

    private static String s = "Hello World, I 23 love you";

    public static void main(String[] args) {
        process(new upCase(), s);
        process(new downCase(), s);
        process(new splitCase(), s);
    }
}
