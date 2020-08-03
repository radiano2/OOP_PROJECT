package com.company;

public class Rectangle {

    int height ;
    int width ;

//    public Rectangle() {
//        System.out.println("Cretingng");
//    }

    public Rectangle(int height , int width) {
        System.out.println("Cretingng");
    }

    public int perimeter(int height , int width){
        return 2*height + 2*width;
    }

}
