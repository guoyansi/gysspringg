package gysspring.test;

import gysspring.test.a.People;
import gysspring.test.a.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    @Bean
    public People people(){
        People people = new People();
        people.setName("郭延思");
        people.setAge(23);
        return people;
    }

    @Bean
    public Person person(){
        Person people = new Person();
        people.setName("郭延思Person");
        people.setAge(32);
        return people;
    }
}
