package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
    
    // define a field for dependency
    private FortuneService fortuneService;

    // define a contructor for dependency injection
    public BaseballCoach(FortuneService theFortuneService) {
        fortuneService = theFortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Spend 30 minutes in the batting practice";
    }

    @Override
    public String getDailyFortune() {
        
        // use my fortuneservice to get fortune
        return fortuneService.getFortune();
    }
}
