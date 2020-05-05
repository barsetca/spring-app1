package ru.cherniak.springlearn;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");


        Music rockBean = context.getBean("rockMusic", Music.class);
        Music classicalBean = context.getBean("classicalMusic", Music.class);
        Music rapBean = context.getBean("rapMusic", Music.class);


        MusicPlayer musicPlayer1 = new MusicPlayer(rockBean);
        MusicPlayer musicPlayer2 = new MusicPlayer(classicalBean);
        MusicPlayer musicPlayer3 = new MusicPlayer(rapBean);


        musicPlayer1.playMusic();
        musicPlayer2.playMusic();
        musicPlayer3.playMusic();


        context.close();
    }
}
