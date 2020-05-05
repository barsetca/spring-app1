package ru.cherniak.springlearn;

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
