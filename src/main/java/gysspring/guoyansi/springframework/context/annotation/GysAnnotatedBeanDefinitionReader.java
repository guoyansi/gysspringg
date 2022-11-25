package gysspring.guoyansi.springframework.context.annotation;

import gysspring.guoyansi.springframework.beans.factory.support.GysBeanDefinitionRegistry;
import gysspring.guoyansi.springframework.core.env.GysEnvironment;
import gysspring.guoyansi.springframework.util.GysAssert;
import gysspring.guoyansi.springframework.util.MyTool;

public class GysAnnotatedBeanDefinitionReader {

    private final GysBeanDefinitionRegistry registry;

    /*public GysAnnotatedBeanDefinitionReader() {
    }*/
    public GysAnnotatedBeanDefinitionReader(GysBeanDefinitionRegistry registry) {
        this(registry, getOrCreateEnvironment(registry));
    }
    public GysAnnotatedBeanDefinitionReader(GysBeanDefinitionRegistry registry, GysEnvironment environment) {
        GysAssert.notNull(registry,"GysBeanDefinitionRegistry 不能为空");
        GysAssert.notNull(environment,"environment 不能为空");
        this.registry=registry;
    }

    private static GysEnvironment getOrCreateEnvironment(GysBeanDefinitionRegistry registry){
        return MyTool.getOrCreateEnvironment(registry);
    }

}
