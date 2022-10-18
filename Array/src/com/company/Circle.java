package com.company;

public class Circle {
    private double radius;

    public Circle(double radius){
        if(radius<0){
            this.radius =0;
        } else{
            this.radius = radius;
        }

    }

    public double getRadius(){
        if(this.radius<0){
           return this.radius = 0;

        }else {
            return this.radius;
        }
    }

    public double getArea(){
        return Math.pow(this.radius,2)*Math.PI;
    }
}



