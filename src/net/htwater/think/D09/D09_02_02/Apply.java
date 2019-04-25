package net.htwater.think.D09.D09_02_02;

import java.util.Arrays;

/**
 * Created by 96955 on 2019/1/7.
 */
public class Apply {
    public static void process(Processor processor, Object object) {
        System.out.println("using Processor" + processor.name());
        System.out.println(processor.process(object));
    }

    public static String s = "Shy Cambrian Napoleon";

    public static void main(String[] args) {
        process(new Upcase(), s);
        process(new Downcase(), s);
        process(new Splitter(), s);
    }
}


class Upcase extends StringProcessor {

    @Override
    public String process(Object input) {
        return (input + "").toUpperCase();
    }
}

class Downcase extends StringProcessor {
    @Override
    public String process(Object input) {
        return (input + "").toLowerCase();
    }
}

class Splitter extends StringProcessor {
    @Override
    public String process(Object input) {
        return Arrays.toString((input + "").split(" "));
    }
}
