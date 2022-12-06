package com.example.task_01.controllers;

import com.example.task_01.models.Celebration;
import com.example.task_01.models.Greeting;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalTime;

@RestController
@RequestMapping(value = "/greeting")
public class GreetingController {

    @GetMapping()
    public ResponseEntity<Greeting> goodDay(){
        Greeting greeting = new Greeting("Good Afternoon","Georgia", LocalTime.now());
        return new ResponseEntity<>(greeting, HttpStatus.OK);
    }

    @GetMapping("/christmas")
    public ResponseEntity<Celebration> merryChristmas(){
        Celebration christmas = new Celebration("Merry Christmas");
        return new ResponseEntity<>(christmas, HttpStatus.OK);
    }




}
