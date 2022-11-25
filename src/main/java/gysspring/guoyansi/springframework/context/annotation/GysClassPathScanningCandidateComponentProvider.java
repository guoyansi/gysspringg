package gysspring.guoyansi.springframework.context.annotation;

import gysspring.guoyansi.springframework.context.GysResourceLoaderAware;
import gysspring.guoyansi.springframework.core.env.GysEnvironment;
import gysspring.guoyansi.springframework.core.io.GysResourceLoader;
import gysspring.guoyansi.springframework.core.io.GysResourcePatternResolver;
import gysspring.guoyansi.springframework.core.io.GysResourcePatternUtils;
import gysspring.guoyansi.springframework.core.type.filter.GysAnnotationTypeFilter;
import gysspring.guoyansi.springframework.core.type.filter.GysTypeFilter;
import gysspring.guoyansi.springframework.stereotype.GysComponent;
import gysspring.guoyansi.springframework.util.GysAssert;
import io.micrometer.core.lang.Nullable;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.type.filter.AnnotationTypeFilter;
import org.springframework.util.ClassUtils;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.List;

/**
 * 扫描候选部件提供者
 */
public class GysClassPathScanningCandidateComponentProvider implements GysResourceLoaderAware {

    private final List<GysTypeFilter> includeFilters=new ArrayList<>();

    @Nullable
    private GysEnvironment environment;

    @Nullable
    private GysConditionEvaluator conditionEvaluator;

    @Nullable
    private GysResourcePatternResolver resourcePatternResolver;

    protected void registerDefaultFilters(){
        //
        this.includeFilters.add(new GysAnnotationTypeFilter(GysComponent.class));
        ClassLoader cl = GysClassPathScanningCandidateComponentProvider.class.getClassLoader();
        //todo gys
        /*try {
            this.includeFilters.add(new AnnotationTypeFilter(
                    ((Class<? extends Annotation>) ClassUtils.forName("javax.annotation.ManagedBean", cl)), false));
            logger.trace("JSR-250 'javax.annotation.ManagedBean' found and supported for component scanning");
        }
        catch (ClassNotFoundException ex) {
            // JSR-250 1.1 API (as included in Java EE 6) not available - simply skip.
        }
        try {
            this.includeFilters.add(new AnnotationTypeFilter(
                    ((Class<? extends Annotation>) ClassUtils.forName("javax.inject.Named", cl)), false));
            logger.trace("JSR-330 'javax.inject.Named' annotation found and supported for component scanning");
        }
        catch (ClassNotFoundException ex) {
            // JSR-330 API not available - simply skip.
        }*/
    }

    protected void setEnvironment(GysEnvironment environment) {
        GysAssert.notNull(environment,"Environment不能为空");
        this.environment=environment;
        this.conditionEvaluator=null;
    }

    @Override
    public void setResourceLoader(GysResourceLoader resourceLoader) {
        this.resourcePatternResolver= GysResourcePatternUtils.getResourcePatternResolver(resourceLoader);
        //todo gys待完善
    }
}
