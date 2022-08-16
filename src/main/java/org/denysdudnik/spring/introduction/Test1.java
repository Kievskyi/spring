package org.denysdudnik.spring.introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet dog = context.getBean("myPet", Dog.class);
        dog.say();
    }
}