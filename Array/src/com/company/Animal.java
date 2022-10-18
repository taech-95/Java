package com.company;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int height;

    public Animal(String name, int brain, int body, int size, int height) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.height = height;
    }


    public void eat(){
        System.out.println("Animal eat");
    }

    public void move(int speed){
        System.out.println("Animal move with speed " + speed);
    }

    public String getName() {
        return name;
    }

    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getHeight() {
        return height;
    }
}
