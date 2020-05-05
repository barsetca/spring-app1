package ru.cherniak.springlearn;

public class ClassicalMusic implements Music{
    @Override
    public String getSong() {
        return "Classical song";
    }
}
