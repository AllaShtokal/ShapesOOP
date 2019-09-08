package com.alla.testove.shapes;

import com.alla.testove.Shape;

public class Trapeze extends Shape {
    private static final String name ="Трапецыя";
    private double A;
    private double B;
    private double H;

    public Trapeze(String color, double A, double B, double H){
        super.color = color;
        this.A = A;
        this.B = B;
        this.H = H;
    }
    public double getHeight(){
        return H;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public double getArea() {
        return Math.round(H*A*B/2*100.00)/100.00;
    }

    @Override
    public String uniqueMethod() {
        return "высота: " +getHeight() + " ед., ";
    }
}
