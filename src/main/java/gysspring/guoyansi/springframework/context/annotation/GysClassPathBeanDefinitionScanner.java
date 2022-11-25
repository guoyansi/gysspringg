package gysspring.guoyansi.springframework.context.annotation;

import gysspring.guoyansi.springframework.beans.factory.support.GysBeanDefinitionRegistry;
import gysspring.guoyansi.springframework.core.env.GysEnvironment;
import gysspring.guoyansi.springframework.core.env.GysStandardEnvironment;
import gysspring.guoyansi.springframework.core.io.GysResourceLoader;
import gysspring.guoyansi.springframework.util.MyTool;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.core.env.Environment;
import org.springframework.core.env.EnvironmentCapable;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.util.Assert;

public class GysClassPathBeanDefinitionScanner extends GysClassPathScanningCandidateComponentProvider{
    private final GysBeanDefinitionRegistry registry;

    public GysClassPathBeanDefinitionScanner(GysBeanDefinitionRegistry registry) {
        this(registry,true);
    }

    public GysClassPathBeanDefinitionScanner(GysBeanDefinitionRegistry registry,boolean useDefaultFilters) {
        this(registry,useDefaultFilters, MyTool.getOrCreateEnvironment(registry));
    }
    public GysClassPathBeanDefinitionScanner(GysBeanDefinitionRegistry registry,boolean useDefaultFilters,GysEnvironment environment) {
        this(registry,useDefaultFilters, environment,(GysResourceLoader) registry);
    }
    public GysClassPathBeanDefinitionScanner(GysBeanDefinitionRegistry registry, boolean useDefaultFilters, GysEnvironment environment, GysResourceLoader resourceLoader) {
       this.registry=registry;
        if (useDefaultFilters) {
            super.registerDefaultFilters();
        }
        super.setEnvironment(environment);
        super.setResourceLoader(resourceLoader);
    }
}
