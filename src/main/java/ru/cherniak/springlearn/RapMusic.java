package ru.cherniak.springlearn;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RapMusic implements Music {

    private List<String> songs = new ArrayList<>();

    // Блок инициализации объекта (англ. Instance initialization block)
    // Выполняется каждый раз, когда создается объект класса
    {
        songs.add("Rap song1");
        songs.add("Rap song2");
        songs.add("Rap song3");
    }

    @Override
    public List<String> getSong() {
        return songs;
    }
}

