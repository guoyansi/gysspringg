package c;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Transactional
@Service(value = "transactionalService")
public @interface TransactionalService {

    String name() default "";
    String transactionManager() default "txManager2";
    //String transactionManager() default "";
}
