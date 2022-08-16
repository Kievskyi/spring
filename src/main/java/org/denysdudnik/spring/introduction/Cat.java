package org.denysdudnik.spring.introduction;

import org.springframework.stereotype.Component;

//@Component("catBean")
public class Cat implements Pet {

    public Cat() {
        System.out.println("Cat bean is created!");
    }

    private void init() {
        System.out.println("Class Dog: init method");
    }

    private void destroy() {
        System.out.println("Class Dog: destroy method");
    }

    @Override
    public void say() {
        System.out.println("Meow-Meow!");
    }
}
