package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    
    public static void main(String[] args) {
        
        // Load the spring config
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrive bean
        CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);

        // call methods of the bean
        System.out.println(theCoach.getDailyWorkout());

        // let us call for new fortunes
        System.out.println(theCoach.getDailyFortune());

        // calling new methods.
        System.out.println(theCoach.getEmailAddress());

        System.out.println(theCoach.getTeam());

        //close context
        context.close();
    }
}
