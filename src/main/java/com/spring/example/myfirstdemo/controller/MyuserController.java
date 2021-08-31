package com.spring.example.myfirstdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.ArrayList;
@RestController
public class MyuserController {

    @GetMapping("/hellodevops")
    public String getNames() {
        return ( "Welcome to Dockers and K8S, Jenkins ");
    }

    @GetMapping("/hellopgdevopsfolks")
    public String getKanha() {
        return ( "Welcome to pg devops folks and team");
    }

    @GetMapping("/helloteam")
    public String getTeam() {
        return ( "Welcome to my team");
    }



    }


