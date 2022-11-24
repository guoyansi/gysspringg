package d;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//@EnableHelloWorld
//@Configuration
//新增一行
@Import({HelloWorldConfiguration.class})
public class EnableHelloWorldBootstrap {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        //新增一行
        context.register(EnableHelloWorldBootstrap.class);
        //这行的注册不需要了
        //context.register(HelloWorldConfiguration.class);
        context.refresh();
        String helloWorld=context.getBean("helloWorld",String.class);
        System.out.println(helloWorld);
        context.close();
    }
}
