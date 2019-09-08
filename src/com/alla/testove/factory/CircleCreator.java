package com.alla.testove.factory;

import com.alla.testove.Creator;
import com.alla.testove.Shape;
import com.alla.testove.shapes.Circle;

import static com.alla.testove.ClassGenerator.GenerateValue;
import static com.alla.testove.Colors.randomColor;

public class CircleCreator extends Creator {
    @Override
    public Shape Create() {
        return new Circle(randomColor().toString(), GenerateValue(1,60));
    }
}
