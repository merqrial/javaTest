package com.luv2code.springdemo;

public class RandomFortuneService implements FortuneService{
    
    private final String[] fortunesStrings = {"You are sure to win!", "Things look a bit dicy today!", "My god what a fortune!"};

    @Override
    public String getFortune() {
        return fortunesStrings[(int)Math.floor(Math.random()*3)];
    }
}
