package gysspring.test.a;

import lombok.Data;

@Data
public class Person /*implements FactoryBean*/ {

    private String name;
    private int age;

    /*@Override
    public Object getObject() throws Exception {
        return new People();
    }

    @Override
    public Class<?> getObjectType() {
        return People.class;
    }*/
}
