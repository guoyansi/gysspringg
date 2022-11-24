package gysspring.guoyansi.springframework.util;

import gysspring.guoyansi.springframework.beans.factory.support.GysBeanDefinitionRegistry;
import gysspring.guoyansi.springframework.core.env.GysEnvironment;
import gysspring.guoyansi.springframework.core.env.GysStandardEnvironment;
import org.springframework.core.env.EnvironmentCapable;
import org.springframework.util.Assert;

public class MyTool {

    public static GysEnvironment getOrCreateEnvironment(GysBeanDefinitionRegistry registry) {
        Assert.notNull(registry, "BeanDefinitionRegistry must not be null");
        /*if (registry instanceof EnvironmentCapable) {
            return ((EnvironmentCapable) registry).getEnvironment();
        }*/
        return new GysStandardEnvironment();
    }
}
