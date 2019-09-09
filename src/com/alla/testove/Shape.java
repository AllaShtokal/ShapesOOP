package com.alla.testove;

public abstract class Shape {

    protected String color;

    protected abstract double getArea();
    protected abstract String uniqueMethod();
    protected abstract String getName();

    private String getColor(){
        return color;
    }

    protected void draw() {
        System.out.println(
                 "Фигура: " + getName() +
                 ", площадь: " + getArea() +
                 " кв. ед., " + uniqueMethod() +
                 "цвет: " + getColor() + ".");

    }

}






