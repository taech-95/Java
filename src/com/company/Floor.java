package com.company;

public class Floor {
    private  double height;
    private  double width;

    public Floor(){
        this(0,0);
    }
    public Floor(double height, double width){
        if (height < 0) {
            this.height=0;
        }else{
            this.height = height;
        }
        if(width < 0){
            this.width=0;
        } else{
            this.width = width;
        }

    }

    public double getArea(){
        return this.height*this.width;
    }
}
