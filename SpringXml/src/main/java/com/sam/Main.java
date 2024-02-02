package com.sam;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //creates a container
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        //gets the object
        Animal obj = (Animal) context.getBean("animal");
        obj.Speak();
    }
}