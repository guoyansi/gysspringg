package gysspring.guoyansi.springframework.context.annotation;

import gysspring.guoyansi.springframework.core.metrics.GysStartupStep;
import gysspring.guoyansi.springframework.context.support.GysGenericApplicationContext;

public class GysAnnotationConfigApplicationContext extends GysGenericApplicationContext {

    private final GysAnnotatedBeanDefinitionReader reader;

    private final

    public GysAnnotationConfigApplicationContext() {
        GysStartupStep createAnnotatedBeanDefReader = this.getApplicationStartup().start("spring.context.annotated-bean-reader.create");
        this.reader=new GysAnnotatedBeanDefinitionReader(this);
        createAnnotatedBeanDefReader.end();
    }
    public GysAnnotationConfigApplicationContext(Class<?>... componentClasses) {
       this();

    }
}
