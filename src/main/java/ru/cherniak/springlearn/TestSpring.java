package ru.cherniak.springlearn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        //change application-context.xml to SpringConfig
       // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);


//        Music rockBean = context.getBean("rockMusic", Music.class);
//        Music classicalBean = context.getBean("classicalMusic", Music.class);
//        Music rapBean = context.getBean("rapMusic", Music.class);



//        MusicPlayer musicPlayer1 = new MusicPlayer(rockBean);
//        MusicPlayer musicPlayer2 = new MusicPlayer(classicalBean);
//        MusicPlayer musicPlayer3 = new MusicPlayer(rapBean);

        /*
        Пометив MusicPlayer аннотациями @Component и @Autowired мы создаем бин через контекст спринга
         */

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer" , MusicPlayer.class);
//        musicPlayer1.playMusic();
//        musicPlayer2.playMusic();
//        musicPlayer3.playMusic();

 //       if have Computer
//        Computer computer = context.getBean("computer", Computer.class);
//
//        System.out.println(computer);

        System.out.println(musicPlayer1.getName());
        System.out.println(musicPlayer1.getVolume());



        ClassicalMusic classicalMusic1 = context.getBean("classicalMusic", ClassicalMusic.class);
        //checking @Scope
        ClassicalMusic classicalMusic2 = context.getBean("classicalMusic", ClassicalMusic.class);
//        System.out.println(classicalMusic1 == classicalMusic2);


        context.close();
    }
}
