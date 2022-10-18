package com.company;

public class Calc {
    private Floor floor;
    private Carpet carpet;

    public Calc(Floor floor, Carpet carpet){
        this.carpet = carpet;
        this.floor = floor;
    }

    public double getTotalCost(){
        return this.floor.getArea()*this.carpet.getCost();
    }
}
