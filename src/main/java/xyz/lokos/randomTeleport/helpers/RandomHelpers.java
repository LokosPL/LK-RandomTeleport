package xyz.lokos.randomTeleport.helpers;

import org.apache.commons.lang3.Validate;

import java.util.Random;

public class RandomHelpers {

    public static double getRandomDouble(double min, double max){
        Validate.isTrue(max > min, "Max has to be bigger than min");
        return new Random().nextDouble() * (max - min) + min;
    }
}
