package b;

import java.lang.reflect.AnnotatedElement;

public class Animal {

    public String say(){
        return "a";
    }

    private String run(String name){
        return name;
    }


    public static void main(String[] args) {
        AnnotatedElement animalClass = Animal.class;
        Class<Animal> animalClass1 = Animal.class;
    }
}
