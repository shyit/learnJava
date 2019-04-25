package net.htwater.think.D09.D09_02_03;

import java.util.Arrays;

/**
 * Created by 96955 on 2019/2/15.
 */
public class Apply {
    public static void process(Processor processor, Object object) {
        System.out.println("Using Processor" + processor.name());
        System.out.println(processor.process(object));
    }

    private static String s = "Hello World, I love you";

    public static void main(String[] args){
        process(new Processor(),s);
        process(new Upcase(),s);
        process(new Downcase(),s);
        process(new Splitter(),s);
    }
}

class Processor {
    public String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input) {
        return input;
    }
}

class Upcase extends Processor {
    @Override
    String process(Object input) {
        return input.toString().toUpperCase();
    }
}

class Downcase extends Processor {
    @Override
    String process(Object input) {
        return input.toString().toLowerCase();
    }
}

class Splitter extends Processor {
    @Override
    String process(Object input) {
        return Arrays.toString(input.toString().split(" "));
    }
}

