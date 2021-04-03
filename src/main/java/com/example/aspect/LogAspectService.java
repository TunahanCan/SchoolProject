package com.example.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 *
 * @author tunahan
 */
@Aspect
@Component
public class LogAspectService {

    @Before(value = "execution(* com.example.restcontroller.TestController.*(..))")
    public void beforeAdvice(JoinPoint joinPoint) {
        System.out.println("Before method:" + joinPoint.getSignature());
        System.out.println("Creating Employee with name - ");
    }

    @After(value = "execution(* com.example.restcontroller.TestController.*(..))")
    public void afterAdvice(JoinPoint joinPoint) {
        System.out.println("After method:" + joinPoint.getSignature());
        System.out.println("Successfully created Employee with name - "
        );
    }

}
