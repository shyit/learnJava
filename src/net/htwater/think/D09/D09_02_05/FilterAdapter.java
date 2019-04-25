package net.htwater.think.D09.D09_02_05;

import net.htwater.think.D09.D09_02_04.Filter;
import net.htwater.think.D09.D09_02_04.WaveForm;

/**
 * Created by 96955 on 2019/2/15.
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
    public WaveForm process(Object input) {
        return filter.process((WaveForm) input);
    }
}
