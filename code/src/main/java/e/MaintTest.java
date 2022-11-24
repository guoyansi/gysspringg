package e;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Objects;

public class MaintTest {
    public static void main(String[] args) {
        test1();
    }

    private static void test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyComponent.class);
        Object people = context.getBean("people");
        System.out.println(people.toString());
    }

    private static void test2(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyComponent.class);
        //返回其它类对象
        Object object = context.getBean("person");
        System.out.println(object);
        //返回自己的对象
        Object object2 = context.getBean("&person");
        System.out.println(object2);
    }
}
