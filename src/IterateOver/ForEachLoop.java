package IterateOver;

import java.util.ArrayList;

public class ForEachLoop {

    public static void start() {

        Testing.init();

        for (int times = 0; times < Testing.SIZE; times++) {
            for (int i : Testing.arrInt) {Testing.sumInt += i;}
            for (long i : Testing.arrLong) {Testing.sumLong += i;}
            for (double i : Testing.arrDouble) {Testing.sumDouble += i;}

        }
    }
}
