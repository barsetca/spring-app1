package ru.cherniak.springlearn;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    public static void main(String[] args) {
        //change application-context.xml to SpringConfig
       // ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);

        /*
        Пометив MusicPlayer аннотациями @Component и @Autowired мы создаем бин через контекст спринга
         */

        MusicPlayer musicPlayer1 = context.getBean("musicPlayer" , MusicPlayer.class);


 //       if have Computer
Computer computer = context.getBean("computer", Computer.class);
//
System.out.println(computer);

        System.out.println(musicPlayer1.getName());
        System.out.println(musicPlayer1.getVolume());

        context.close();
    }
}
