package com.sam;

public class Bird implements Creatures{

    public Bird(){
        System.out.println("Bird Object Created");
    }
    @Override
    public void Speak(){
        System.out.println("Bird singing...");
    }
}

