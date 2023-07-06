package com.terzo.SpringBoot3.rest;

import com.terzo.SpringBoot3.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach coach;

    @Autowired
    public DemoController(Coach coach) {
        this.coach = coach;
    }

    @GetMapping("/dailyWorkout")
    public String getDailyWorkout(){
        return coach.getDailyWorkout();
    }
}
