package IterateOverWithCond;


public class ForLoop {

    public static void start() {

        Testing.init();

        for (int times = 0; times < Testing.SIZE; times++) {
            for (int i = 0; i < Testing.SIZE; i++) {
                if (Testing.arrInt[i] > 3800 && Testing.arrInt[i] % 3 == 0) {Testing.sumInt = Testing.arrInt[i];}
            }
            for (int i = 0; i < Testing.SIZE; i++) {
                if (Testing.arrLong[i] > 3800 && Testing.arrLong[i] % 3 == 0) {Testing.sumLong = Testing.arrLong[i];}
            }
            for (int i = 0; i < Testing.SIZE; i++) {
                if (Testing.arrDouble[i] > 3800 && Testing.arrLong[i] % 3 == 0) {Testing.sumDouble = Testing.arrDouble[i];}
            }

        }

    }
}

