package com.company;

public class Cylinder extends Circle {
    private double height;

    public Cylinder(double radius, double height){
        super(radius);
        this.height = height;
    }
    public double getHeight(){
        if(this.height<0){
            return this.height = 0;
        }
        else{
            return this.height;
        }
    }

    public double getVolume(){
        return super.getArea()* this.height;
    }

}
