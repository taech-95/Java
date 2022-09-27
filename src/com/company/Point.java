package com.company;

public class Point {
    private int x;
    private int y;

    public Point(){
        this(0,0);
    }
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distance(){
        return Math.sqrt(0.0 - getX())*(0.0 - getX())+ (0.0-getY())*(0.0-getX());

    }

    public double distance(int x, int y){
        return Math.sqrt(x - getX())*(x - getX())+ (y-getY())*(y-getX());

    }
    public double distance(Point x){
        return Math.sqrt(x.getX() - getX())*(x.getX() - getX())+ (x.getY()-getY())*(x.getY()-getX());

    }

}
