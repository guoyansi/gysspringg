package a;

import java.util.concurrent.atomic.AtomicBoolean;

public class MainTest {

    public static void main(String[] args) {
        test1();
    }
    private static void test1(){
        AtomicBoolean a = new AtomicBoolean();
        System.out.println(a.toString());
        AtomicBoolean b = new AtomicBoolean(true);
        System.out.println(b.toString());
    }
}
