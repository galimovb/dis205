package ru.itis.spring_lab;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.itis.spring_lab.config.Config;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new AnnotationConfigApplicationContext(Config.class);
        Main mainClass= (Main) context.getBean("main");
        mainClass.run();

    }
}