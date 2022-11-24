package gysspring.guoyansi.springframework.context;

import gysspring.guoyansi.springframework.core.metrics.GysApplicationStartup;

public interface GysConfigurableApplicationContext {

    GysApplicationStartup getApplicationStartup();
}
