package org.denysdudnik.spring.aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturningBookLoggingAdvise(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("aroundReturningBookLoggingAdvise : в библиотеку" +
                " пытаются вернуть книгу");
        Object targetMethodResult = null;
        try {
            targetMethodResult = proceedingJoinPoint.proceed();
        } catch (Exception e) {
            System.out.println("aroundReturningBookLoggingAdvise: " +
                    "было поймано исключение " + e);
            throw e;
        }

        System.out.println("aroundReturningBookLoggingAdvise : в библиотеку" +
                " успешно вернули книгу");
        return targetMethodResult;
    }
}
