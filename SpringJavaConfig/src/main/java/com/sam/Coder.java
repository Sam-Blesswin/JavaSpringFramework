package com.sam;

public class Coder {
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    private int age;
    private Computer computer;

    public void Code(){
        computer.Compile();
    }
}
