package IterateOver;


import java.util.ArrayList;

public class ForLoop {

    public static void start() {

        Testing.init();

        for (int times = 0; times < Testing.SIZE; times++) {
            for (int i = 0; i < Testing.SIZE; i++) {
                Testing.sumInt = Testing.arrInt[i];
            }
            for (int i = 0; i < Testing.SIZE; i++) {Testing.sumLong = Testing.arrLong[i];}
            for (int i = 0; i < Testing.SIZE; i++) {Testing.sumDouble = Testing.arrDouble[i];}

        }
    }
}

