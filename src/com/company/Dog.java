package com.company;

public class Dog extends Animal{

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int height, int eyes, int legs, int teeth, int tail, String coat) {
        super(name, 1, 1, size, height);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.coat = coat;
        this.teeth = teeth;
    }
    private void chew(){
        System.out.println("Dog chew called");
    }

    private void walk(){
        System.out.println("Dog.walk() called");
        move(5);
    }

    private void moveLegs(int speed){
        System.out.println("Dof.moveLegs() called");
    }


    @Override
    public void eat() {
        System.out.println("Dog.eat() called");
        chew();
    }

    @Override
    public void move(int speed) {
        System.out.println("Animal move with speed " + speed);
        moveLegs(speed);
        super.move(speed);
    }
}
