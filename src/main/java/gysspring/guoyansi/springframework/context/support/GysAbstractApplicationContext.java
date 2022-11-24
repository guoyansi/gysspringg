package gysspring.guoyansi.springframework.context.support;

import gysspring.guoyansi.springframework.context.GysConfigurableApplicationContext;
import gysspring.guoyansi.springframework.core.metrics.GysApplicationStartup;

public abstract class GysAbstractApplicationContext implements GysConfigurableApplicationContext {

    private GysApplicationStartup applicationStartup=GysApplicationStartup.DEFAULT;

    @Override
    public GysApplicationStartup getApplicationStartup() {
        return this.applicationStartup;
    }
}
