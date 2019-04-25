package net.htwater.think.D09.D09_02_02;

import net.htwater.think.D09.D09_02.Filter;
import net.htwater.think.D09.D09_02.WaveForm;

/**
 * Created by 96955 on 2019/1/7.
 */
public class FilterAdapter implements Processor {

    Filter filter;

    public FilterAdapter(Filter filter) {
        this.filter = filter;
    }


    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public WaveForm process(Object object) {
        return filter.process((WaveForm) object);
    }
}
