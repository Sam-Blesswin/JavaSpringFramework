package com.sam.SpringBootDemo;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
    public Laptop() {
        System.out.println("Laptop Created");
    }

    @Override
    public void Compile() {
        System.out.println("Laptop Compile");
    }
}
