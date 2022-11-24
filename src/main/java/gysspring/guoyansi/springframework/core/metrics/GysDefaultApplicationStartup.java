package gysspring.guoyansi.springframework.core.metrics;

public class GysDefaultApplicationStartup implements GysApplicationStartup {

    private static final GysDefaultStartupStep DEFAULT_STARTUP_STEP=new GysDefaultStartupStep();

    public GysDefaultApplicationStartup() {
    }

    @Override
    public GysStartupStep start(String name) {
        return DEFAULT_STARTUP_STEP;
    }

    static class GysDefaultStartupStep implements GysStartupStep{
        @Override
        public void end() {

        }
    }
}
