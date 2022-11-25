package gysspring.guoyansi.springframework.core.type.filter;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;

public class GysAnnotationTypeFilter extends GysAbstractTypeHierarchyTraversingFilter {

    private final Class<? extends Annotation> annotationType;
    private final boolean considerMetaAnnotations;

    public GysAnnotationTypeFilter(Class<? extends Annotation> annotationType) {
        this(annotationType,true,false);
    }

    public GysAnnotationTypeFilter(Class<? extends Annotation> annotationType,boolean considerMetaAnnotations,boolean considerInterFaces) {
        super(annotationType.isAnnotationPresent(Inherited.class),considerInterFaces);
        this.annotationType=annotationType;
        this.considerMetaAnnotations=considerMetaAnnotations;
    }
}
