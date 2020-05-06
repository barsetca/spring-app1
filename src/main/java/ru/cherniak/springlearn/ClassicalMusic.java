package ru.cherniak.springlearn;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@Scope("prototype")
public class ClassicalMusic implements Music {


    // for "prototype" beans init method call each time
    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization");
    }

    @Override
    public String getSong() {
        return "Classical song";
    }


// for "prototype" beans destroy method not call
    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction");
    }
}
