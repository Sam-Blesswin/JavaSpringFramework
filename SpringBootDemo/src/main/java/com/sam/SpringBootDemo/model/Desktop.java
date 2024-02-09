package com.sam.SpringBootDemo.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer{
    public Desktop() {
        System.out.println("Desktop Created");
    }

    @Override
    public void Compile() {
        System.out.println("Desktop Compile");
    }
}
