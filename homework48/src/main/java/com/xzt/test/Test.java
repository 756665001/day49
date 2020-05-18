package com.xzt.test;

import com.xzt.Service.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext app=new ClassPathXmlApplicationContext("MyAop.xml");
        Student student= (Student) app.getBean("student");
        student.playGame();
        System.out.println("---------------------------");
        student.readBook();

    }
}
