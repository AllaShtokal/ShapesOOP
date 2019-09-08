package com.alla.testove.factory;

import com.alla.testove.Creator;
import com.alla.testove.Shape;
import com.alla.testove.shapes.Triangle;

import static com.alla.testove.ClassGenerator.GenerateValue;
import static com.alla.testove.Colors.randomColor;

public class TriangleCreator extends Creator {
    @Override
    public Shape Create() {
        return new Triangle (randomColor().toString(), GenerateValue(1, 100),GenerateValue(1, 100));
    }
}
