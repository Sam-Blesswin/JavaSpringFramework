package com.sam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //creates a container and
        // also creates the object for Singleton scope
        //singleton: only one instance per class
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        //gets the object
        Animal animal1 = (Animal) context.getBean("animal");
        animal1.age = 30;
        animal1.Speak();

        Animal animal2 = (Animal) context.getBean("animal");
        animal2.Speak();

        //Objects are created and referenced for prototype scope
        Mammal mammal1 = (Mammal) context.getBean("mammal");
        mammal1.age = 30;
        mammal1.Speak();

        Mammal mammal2 = (Mammal) context.getBean("mammal");
        mammal2.Speak();
    }
}