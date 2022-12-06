package com.example.task_01.models;

import java.time.LocalTime;

public class Greeting {
//    Properties
    private String dayNightGreet;
    private String name;
    private LocalTime timeOfDay;

//    Constructor
    public Greeting(String dayNightGreet, String name, LocalTime timeOfDay){
        this.dayNightGreet = dayNightGreet;
        this.name = name;
        this.timeOfDay = timeOfDay.now();
    }

//    POJO
    public Greeting(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalTime getTimeOfDay() {
        return timeOfDay;
    }

    public void setTimeOfDay(LocalTime timeOfDay) {
        this.timeOfDay = timeOfDay;
    }

    public String getDayNightGreet() {
        return dayNightGreet;
    }

    public void setDayNightGreet(String dayNightGreet) {
        this.dayNightGreet = dayNightGreet;
    }
}
