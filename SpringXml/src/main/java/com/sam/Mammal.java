package com.sam;

public class Mammal implements Creatures{

    int age = 24;

    public Mammal(){
        System.out.println("Mammal Object Created");
    }

    @Override
    public void Speak(){
        System.out.println("Mammal speaking...");
        //System.out.println("Mammal: Age = " + age);
    }
}
