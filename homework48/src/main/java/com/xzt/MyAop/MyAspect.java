package com.xzt.MyAop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class MyAspect {

    @Before(value = "execution(* com.xzt.Service.StudentImpl.*())")
    public void before() {
        System.out.println("方法执行之前");
    }

    @AfterReturning(value = "execution(* com.xzt.Service.StudentImpl.*())")
    public void after() {
        System.out.println("方法执行之后");
    }
}
