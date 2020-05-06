package ru.cherniak.springlearn;

import org.springframework.stereotype.Component;

//@Component
public class ClassicalMusic implements Music{

    public void doMyInit(){
        System.out.println("Doing my initialization");
    }

    @Override
    public String getSong() {
        return "Classical song";
    }

    public void doMyDestroy(){
        System.out.println("Doing my destruction");
    }
}
