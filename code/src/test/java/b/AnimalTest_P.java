package b;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest_P {

    @Test
    void run() throws Exception {
        Class<Animal> clazz = Animal.class;
        Object object = clazz.newInstance();
        Method method = clazz.getDeclaredMethod("run",String.class);
        method.setAccessible(true);
        Object s = method.invoke(object,"gggggggggggg");
        System.out.println(s);
    }
}