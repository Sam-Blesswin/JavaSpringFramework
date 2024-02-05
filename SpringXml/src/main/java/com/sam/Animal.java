package com.sam;

public class Animal {
    private int age;
    private Mammal mammal1;
    private String alias;
    private int legs;

    private Creatures creature;

    public Animal(int legs, String alias){
        System.out.println("Animal para constructor called");
        this.legs = legs;
        this.alias = alias;
    }

    public Creatures getCreature() {
        return creature;
    }

    public void setCreature(Creatures creature) {
        this.creature = creature;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("age setter called");
        this.age = age;
    }

    public Mammal getMammal1() {
        return mammal1;
    }

    public void setMammal1(Mammal mammal1) {
        System.out.println("mammal setter called");
        this.mammal1 = mammal1;
    }

    public Animal(){
        System.out.println("Animal Object Created");
    }

    public void Speak(){
        creature.Speak();
        //System.out.println("Animal : Age = " + age);
    }
}
