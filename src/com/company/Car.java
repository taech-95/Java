package com.company;

public class Car extends Vehicle {
    private String model;
    private String colour;

    public Car(int wheels, int doors, String engine, String model, String colour){
        super(wheels, doors, engine );
        this.model = model;
        this.colour = colour;
    }

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }

}
