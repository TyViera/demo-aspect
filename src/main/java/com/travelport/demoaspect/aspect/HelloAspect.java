package com.travelport.demoaspect.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class HelloAspect {

  @Around("execution(* com.travelport.*.HelloWorld.sayHello(..))")
  public Object onHelloAspect(ProceedingJoinPoint joinPoint) throws Throwable {
    var name = (String) joinPoint.getArgs()[0];
    if (name.equals("admin")) {
      System.out.println("Admin is trying to access hello page");
    }
    return joinPoint.proceed();
  }

  @Before("execution(* com.travelport.demoaspect.controller.HelloWorld.sayHello(..))")
  public void beforeHelloAspect(JoinPoint joinPoint) {
    System.out.println("Before Hello Aspect");
  }

  @After("execution(* com.travelport.demoaspect.controller.HelloWorld.sayHello(..))")
  public void afterHelloAspect(JoinPoint joinPoint) {
    System.out.println("Before Hello Aspect");
  }
}
