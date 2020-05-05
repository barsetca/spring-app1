package ru.cherniak.springlearn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        Music musicBean = context.getBean("musicBean", Music.class);

//        MusicPlayer musicPlayer = new MusicPlayer(musicBean); from Dependency injection =
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

       musicPlayer.playMusic();

        context.close();
    }
}
