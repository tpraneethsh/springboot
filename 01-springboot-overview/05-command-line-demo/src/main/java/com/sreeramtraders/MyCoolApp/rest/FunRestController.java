package com.sreeramtraders.MyCoolApp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {
    @GetMapping("/")
    public String sayHello(){
        return "Hello Praneeth.. from your Mac M2";
    }

    @GetMapping("/workout")
    public String getDailyWorkout(){
        return "Run a hard 10K";
    }
}
