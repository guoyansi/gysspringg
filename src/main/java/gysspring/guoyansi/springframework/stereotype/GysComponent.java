package gysspring.guoyansi.springframework.stereotype;

import org.springframework.stereotype.Indexed;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Indexed
public @interface GysComponent {
    String value() default "";
}
