package com.alla.testove.shapes;

import com.alla.testove.Shape;

public class Triangle extends Shape {
    private static final String name ="Триугольник";
    private double A;
    private double B;
    public Triangle(String color, double A, double B){
        super.color = color;
        this.A = A;
        this.B = B;
    }
    public double getHypotenuse(){
        return Math.round(Math.sqrt(A*A +B*B)*100.00)/100.00;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public double getArea() {
        return Math.round(A*B/2*100.00)/100.00;
    }

    @Override
    public String uniqueMethod() {
        return "гипотенуза: " +getHypotenuse() + " ед., ";
    }
}
