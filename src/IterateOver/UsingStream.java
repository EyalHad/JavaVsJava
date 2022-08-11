package IterateOver;

import java.util.Arrays;

public class UsingStream {

    public static void start() {

        Testing.init();

        for (int times = 0; times < Testing.SIZE; times++) {

            Testing.sumInt = Arrays.stream(Testing.arrInt).sum();
            Testing.sumLong = Arrays.stream(Testing.arrLong).sum();
            Testing.sumDouble = Arrays.stream(Testing.arrDouble).sum();

        }
    }
}
