package gysspring.test;

import gysspring.guoyansi.springframework.context.annotation.GysAnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;

public class GysMain {
    public static void main(String[] args) {
        test2();
    }

    private static void test1(){
        GysAnnotationConfigApplicationContext context = new GysAnnotationConfigApplicationContext(MyComponent.class);
    }
    private static void test2(){
        Assert.notNull(null,"不能为空");
    }

    private static void test3(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyComponent.class);
        Object people = context.getBean("people");
        System.out.println(people.toString());
    }

    private static void test4(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyComponent.class);
        //返回其它类对象
        Object object = context.getBean("person");
        System.out.println(object);
        //返回自己的对象
        Object object2 = context.getBean("&person");
        System.out.println(object2);
    }
}
