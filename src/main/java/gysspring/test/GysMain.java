package gysspring.test;

import gysspring.guoyansi.springframework.context.annotation.GysAnnotationConfigApplicationContext;
import org.springframework.util.Assert;

public class GysMain {
    /*public static void main(String[] args) {
        test2();
    }*/

    private static void test1(){
        GysAnnotationConfigApplicationContext context = new GysAnnotationConfigApplicationContext(TestCompent.class);
    }
    private static void test2(){
        Assert.notNull(null,"不能为空");
    }
}
