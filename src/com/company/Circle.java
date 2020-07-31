package com.company;

public class Circle {
    public Circle(){
    }

    int radius = 5;
    int diameter = 2 * radius;
//    public int getDiameter() {
//        return diameter ;
//    }
//
//    public void setDiameter(int diameter) {
//        this.diameter = diameter;
//    }

    public Circle(int radius ){
        this.radius = radius;
        this.diameter = 2*radius;
    }
    public void area (int radius){
        System.out.println(3.14 * radius * radius);
    }

    public void length(){
        System.out.prinln(3.14 * diameter);
    }
}
