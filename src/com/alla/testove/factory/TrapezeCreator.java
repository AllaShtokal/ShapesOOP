package com.alla.testove.factory;

import com.alla.testove.Creator;
import com.alla.testove.Shape;
import com.alla.testove.shapes.Trapeze;

import static com.alla.testove.ClassGenerator.GenerateValue;
import static com.alla.testove.Colors.randomColor;

public class TrapezeCreator extends Creator {

    @Override
    public Shape Create() {
        return new Trapeze (randomColor().toString(), GenerateValue(1, 100),
                            GenerateValue(1, 100), GenerateValue(1, 60));
    }
}
