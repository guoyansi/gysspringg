package gysspring.guoyansi.springframework.core.metrics;


public interface GysApplicationStartup {

    GysApplicationStartup DEFAULT= new GysDefaultApplicationStartup();

    GysStartupStep start(String name);
}
