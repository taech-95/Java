package com.company;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle( double width, double length){

        this.width = width;
        this.length = length;
        if(length<0){
            this.length = 0;
        }
        if (width<0){
            this.width=0;
        }
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){
        return getWidth() * getLength();
    }
}
