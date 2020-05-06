package ru.cherniak.springlearn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

//@Component - сщздание бина
@Component
public class MusicPlayer {

    private Music music1;
    private Music music2;

    Random random = new Random();

    @Autowired
    public MusicPlayer(@Qualifier("rockMusic") Music music1, @Qualifier("rapMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }


    public String playMusic(TypeMusic typeMusic) {
        switch (typeMusic) {
            case RAP:
                List<String> listRap = music2.getSong();
                return listRap.get(random.nextInt(listRap.size()));
            case ROCK:
                List<String> listRock = music1.getSong();
                return listRock.get(random.nextInt(listRock.size()));
            default:
                return "Unknown music type: " + typeMusic;
        }
    }
}


