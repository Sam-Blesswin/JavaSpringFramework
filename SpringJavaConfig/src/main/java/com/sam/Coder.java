package com.sam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //create a bean on its own stereotype annotation
public class Coder {
    public Coder() {
        System.out.println("Coder Born");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    @Autowired
    @Qualifier("laptop") //to specify the computer instance
    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    @Value("24") //to set default value
    private int age;
    private Computer computer;

    public void Code(){
        computer.Compile();
    }
}
