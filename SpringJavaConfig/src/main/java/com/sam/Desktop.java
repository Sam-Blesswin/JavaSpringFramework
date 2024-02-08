package com.sam;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
//@Scope("prototype") //to set scope as singleton by default
public class Desktop implements Computer
{
    public Desktop() {
        System.out.println("Desktop Created");
    }

    @Override
    public void  Compile(){
        System.out.println("Desktop Compiled");
    }
}
