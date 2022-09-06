package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {
        
        // Load the spring config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrive bean
        Coach theCoach = context.getBean("myCoach", Coach.class);

        // call methods of the bean
        System.out.println(theCoach.getDailyWorkout());

        // let us call for new fortunes
        System.out.println(theCoach.getDailyFortune());

        //close context
        context.close();
    }
}
