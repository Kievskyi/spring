package org.denysdudnik.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScopeTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
        Dog dog = context.getBean("dogBean", Dog.class);
//        Dog dog1 = context.getBean("dogBean", Dog.class);
        dog.say();
//        System.out.println(dog1 == dog);
        context.close();
    }
}
