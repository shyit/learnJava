package net.htwater.think.D09.D09_02_02;

/**
 * Created by 96955 on 2019/1/7.
 */
public abstract class StringProcessor implements Processor {
    @Override
    public String name() {
        return getClass().getSimpleName();
    }

    public abstract Object process(Object object);
}
