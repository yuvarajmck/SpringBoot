package com.terzo.SpringBoot3.common;

public class SwinCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Swim for an hour";
    }
}
