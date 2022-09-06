package com.luv2code.springdemo;
public class MyApp {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // create the object
        Coach theCoach = new TrackCoach();

        // use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}
