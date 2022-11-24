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
        //todo gys 最后一个参数和源码不一致，根据情况在决定是否完善
        this(registry,useDefaultFilters, environment,null);
    }
    public GysClassPathBeanDefinitionScanner(GysBeanDefinitionRegistry registry, boolean useDefaultFilters, GysEnvironment environment, GysResourceLoader resourceLoader) {
       this.registry=registry;
        if (useDefaultFilters) {
            //todo gys 待继续填充
            super.registerDefaultFilters();
        }
        setEnvironment(environment);

        setResourceLoader(resourceLoader);
    }
}
