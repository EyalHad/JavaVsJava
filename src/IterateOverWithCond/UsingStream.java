package IterateOverWithCond;

import java.util.Arrays;

public class UsingStream {

    public static void start() {

        Testing.init();

        for (int times = 0; times < Testing.SIZE; times++) {

            Testing.sumInt = Arrays.stream(Testing.arrInt).filter(x -> x > 3800 && x % 3 == 0).sum();
            Testing.sumLong = Arrays.stream(Testing.arrLong).filter(x -> x > 3800 && x % 3 == 0).sum();
            Testing.sumDouble = Arrays.stream(Testing.arrDouble).filter(x -> x > 3800 && x % 3 == 0).sum();

        }

    }
}
