package net.htwater.think.D09.D09_02_05;

import java.util.Arrays;

/**
 * Created by 96955 on 2019/2/15.
 */
public abstract class StringProcessor implements Processor {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    @Override
    public abstract Object process(Object input);
}

class upCase extends StringProcessor {

    @Override
    public String process(Object input) {
        return input.toString().toUpperCase();
    }
}

class downCase extends StringProcessor {

    @Override
    public String process(Object input) {
        return input.toString().toLowerCase();
    }
}

class splitCase extends StringProcessor {

    @Override
    public String process(Object input) {
        return Arrays.toString(input.toString().split(" "));
    }
}
