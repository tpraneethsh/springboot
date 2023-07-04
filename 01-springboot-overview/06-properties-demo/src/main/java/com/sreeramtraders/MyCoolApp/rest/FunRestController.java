package com.sreeramtraders.MyCoolApp.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${coach.name}")
    private String coachName;

    @Value("${team.name}")
    private String teamName;

    @GetMapping("/teamInfo")
    public String sayTeamInfo(){
        return "Coach: "+coachName+", TeamName: "+teamName;
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello Praneeth.. from your Mac M2";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 10K";
    }
}
