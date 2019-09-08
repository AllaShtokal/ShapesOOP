package com.alla.testove;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ClassGenerator {
        public static double GenerateValue(int min, int max) {
        return Math.floor((ThreadLocalRandom.current().nextDouble(min, max))*100.00)/100.0d;

    }


}
