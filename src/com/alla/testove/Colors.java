package com.alla.testove;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum Colors {
 черный,оранжевый, желтый, голубой, синий, фиолетовый, красный, зеленый, коричневый, белый, бирюзовый, золотой ;

    private static final List<Colors> values =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = values.size();
    private static final Random random = new Random();

    public static Colors randomColor()  {
        return values.get(random.nextInt(SIZE));
    }


}
