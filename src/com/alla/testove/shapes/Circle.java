package com.alla.testove.shapes;

import com.alla.testove.Shape;

public class Circle extends Shape {
    private static final String name ="Круг";
    private double R;
    public Circle(String color, double R){
        super.color = color;
        this.R = R;
    }

    public double getRadius(){
        return R;
    }
    @Override
    public String getName(){
        return name;
    }

    @Override
    public double getArea() {
        return Math.round((Math.PI * Math.pow(R, 2))*100.00)/100.00;
    }

    @Override
    public String uniqueMethod() {
        return "радиус: " +getRadius() + " ед., ";
    }



}
