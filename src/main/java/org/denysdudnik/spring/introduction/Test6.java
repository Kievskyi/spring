package org.denysdudnik.spring.introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//        Person person = context.getBean("personBean", Person.class);
//        person.callYourPet();
        Person person = context.getBean("personBean", Person.class);
        System.out.println(person.getAge());
        System.out.println(person.getSurname());
//        Person person2 = context.getBean("personBean", Person.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
//        Pet cat1 = context.getBean("catBean", Pet.class);
//        person.callYourPet();

        context.close();
    }
}
