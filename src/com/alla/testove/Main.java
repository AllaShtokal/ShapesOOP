package com.alla.testove;
import com.alla.testove.factory.*;

import java.util.ArrayList;

import static com.alla.testove.ClassGenerator.GenerateValue;

public class Main {

    public static void main(String[] args) {

        ArrayList<Creator> creators = new ArrayList<>();
        creators.add(new CircleCreator());
        creators.add(new SquareCreator());
        creators.add(new TriangleCreator());
        creators.add(new TrapezeCreator());

        int SIZE = (int) GenerateValue(1,100); // [1;100)
        System.out.println("Ко-во фигур: " + SIZE);
        Shape[] shapes = new Shape[SIZE]; //наш массив фигур

        //заполняем массив и выводим
        for (int i=0; i<SIZE; i++){
            shapes[i] = creators.get((int)GenerateValue(0,creators.size())).Create();// [0,4)
            shapes[i].draw();
            }

    }
}
