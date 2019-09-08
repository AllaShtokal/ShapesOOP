package com.alla.testove;

public abstract class Shape {

    protected String color;

    public abstract double getArea();
    public abstract String uniqueMethod();
    public abstract String getName();

    public String getColor(){
        return color;
    }

    public  void draw() {
        System.out.println(
                 "Фигура: " + getName() +
                 ", площадь: " + getArea() +
                 " кв. ед., " + uniqueMethod() +
                 "цвет: " + getColor() + ".");

    }

}






