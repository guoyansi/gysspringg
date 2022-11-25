package gysspring.guoyansi.springframework.context.annotation;

import gysspring.guoyansi.springframework.core.metrics.GysStartupStep;
import gysspring.guoyansi.springframework.context.support.GysGenericApplicationContext;

public class GysAnnotationConfigApplicationContext extends GysGenericApplicationContext {

    private final GysAnnotatedBeanDefinitionReader reader;

    private final GysClassPathBeanDefinitionScanner scanner;

    public GysAnnotationConfigApplicationContext() {
        GysStartupStep createAnnotatedBeanDefReader = this.getApplicationStartup().start("spring.context.annotated-bean-reader.create");
        this.reader=new GysAnnotatedBeanDefinitionReader(this);
        createAnnotatedBeanDefReader.end();
        this.scanner=new GysClassPathBeanDefinitionScanner(this);
    }
    public GysAnnotationConfigApplicationContext(Class<?>... componentClasses) {
       this();

    }
}
