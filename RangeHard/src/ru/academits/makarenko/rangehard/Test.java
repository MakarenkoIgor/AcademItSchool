package ru.academits.makarenko.rangehard;

/**
 * Created by Игорь on 05.02.2017.
 */

public class Test {
    public static void main(String[] args) {
        HardRange hardRange = new HardRange(3.6, 5.7);
        HardRange hardRange1 = new HardRange(-6, 3);
        if (hardRange.calcIntersection(hardRange1) == null) {
            System.out.printf("null");

        } else {
            System.out.printf("%f, %f", hardRange.calcIntersection(hardRange1).getFrom(), hardRange.calcIntersection(hardRange1).getTo());
        }
        HardRange[] array = hardRange.calcDifference(hardRange1);
        for(int i = 0; i < array.length; ++i){
            System.out.println(array[i]);
        }
        System.out.printf("%f, %f", hardRange.calcCrossing(hardRange1).getFrom, hardRange.calcIntersection(hardRange1).getTo());

    }
}




