package net.htwater.think.D09.D09_02;

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
        Apply.process(new Processor(), s);
        Apply.process(new Upcase(), s);
        Apply.process(new Downcase(), s);
        Apply.process(new Splitter(), s);
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
        return (input + "").toUpperCase();
    }
}

class Downcase extends Processor {
    @Override
    String process(Object input) {
        return (input + "").toLowerCase();
    }
}

class Splitter extends Processor {
    @Override
    String process(Object input) {
        return Arrays.toString((input + "").split(" "));
    }
}