package com.sam.SpringBootDemo;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    public Desktop() {
        System.out.println("Desktop Created");
    }

    @Override
    public void Compile() {
        System.out.println("Desktop Compile");
    }
}
