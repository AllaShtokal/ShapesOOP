package com.alla.testove.shapes;

import com.alla.testove.Shape;

public class Square extends Shape {

    private final static String name = "Квадрат";
    private double side;
    public Square(String color, double side){
        super.color = color;
        this.side = side;
    }

    private double getSide() {
        return side;
    }

    @Override
    public String getName(){ return name; }

    @Override
    public double getArea() {
        return Math.round(side*side*100.00)/100.00;
    }

    @Override
    public String uniqueMethod() {
        return "длина стороны: " +getSide() + " ед., ";
    }
}
