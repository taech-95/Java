package com.company;

public class Vehicle {
    private int wheels;
    private int doors;
    private String engine;

    public Vehicle(){
        this(0,0,"Engine");
    }

    public Vehicle(int wheels, int doors, String engine) {
        this.wheels = wheels;
        this.doors = doors;
        this.engine = engine;
    }

    public void steering(){
        System.out.println("Vehicle.steering was called");
    }

    public void changingGears(){
        System.out.println("Vehicle.changingGears was called");
    }
    public void moving(int speed){
        System.out.println("Vehicle mowing with speed: " + speed);
    }
}
